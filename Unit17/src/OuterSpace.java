//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private AlienHorde horde;
	private Bullets shots;
	private boolean bulletExist;
	private String direction;
	private final int WIDTH;
	private final int HEIGHT;
	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace(int width, int height)
	{
		setBackground(Color.black);
		
		WIDTH = width;
		HEIGHT = height;
		keys = new boolean[5];
		bulletExist = false;
		ship = new Ship(WIDTH/2, HEIGHT/2, 50, 50, 10);
		shots = new Bullets();
		horde = new AlienHorde();
		direction = "RIGHT";
		
		//create aliens and add to horde
		for (int i = 5; i < WIDTH; i += 100) {
			for (int j = 25; j < 126; j += 50) {
				horde.add(new Alien(i, j, 40, 40, 2));
			}
		}

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,WIDTH,HEIGHT);
		
		
		//draw the ship
		ship.draw(graphToBack);
		
		//keep ship from going out of bounds
		if (ship.getX() >= WIDTH - 55) {
			ship.setX(WIDTH - 55);
		}
		if (ship.getX() < -10) {
			ship.setX(-10);
		}
		if (ship.getY() >= HEIGHT - 90) {
			ship.setY(HEIGHT - 90);
		}
		if (ship.getY() < 0) {
			ship.setY(0);
		}
		
		//draw the aliens
		horde.drawEmAll(graphToBack);
		
		//move Alien horde
		horde.moveEmAll(direction, graphToBack);
				
		if (horde.get(horde.size()-1).getX() + horde.get(horde.size()-1).getWidth() >= WIDTH - 15) {
			direction = "DOWN";
			horde.moveEmAll(direction, graphToBack);
			direction = "LEFT";
		}
				
		if (horde.get(0).getX() + horde.get(0).getWidth() <= 30) {
			direction = "DOWN";
			horde.moveEmAll(direction, graphToBack);
			direction = "RIGHT";
		}
		
		
		//check if space bar has been pressed
		if (bulletExist && shots.get(0).isVisible() == true && shots.get(0).getY() > 0) {
			shots.get(0).move2("UP", graphToBack);
		}
		
		//check if ammo has reached top of screen - set it to invisible and remove it from bullets
		if (bulletExist && shots.get(0).getY() <= 0) {
			shots.get(0).setVisible(false);
			shots.remove(0);
			bulletExist = false;
		}
		
		//move ship
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		
		//fire bullet
		if(keys[4] == true)
		{
			bulletExist = true;
			shots.add(new Ammo(ship.getX(), ship.getY()));
			shots.get(0).setVisible(true);
			shots.cleanEmUp2();
		}
		


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship


		twoDGraph.drawImage(back, null, 0, 0);
	}

	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e){}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

