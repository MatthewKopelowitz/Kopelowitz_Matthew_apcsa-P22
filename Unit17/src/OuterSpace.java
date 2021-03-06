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
	private boolean lost;
	private boolean pressed;
	private boolean loseflag;
	

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
		ship.setSpeed(5);
		shots = new Bullets();
		horde = new AlienHorde();
		direction = "RIGHT";
		lost = false;
		loseflag = false;
		
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
		if (horde.size() != 0) {
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
		}
		
		
/*		
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
*/		
		
		
		
		//bullet collision with aliens
		if (bulletExist = true) {
			for (Ammo b : shots.getList()) {
				if (b.getY() <= 0) {
					b.setVisible(false);
					shots.remove(b);
				}
				if (b.isVisible() == true && b.getY() > 0) {
					b.move2("UP", graphToBack);
				}
			}
		}
		
		
		if (loseflag == false)
			for (Alien a : horde.getAliens()) {
				if (bulletExist == true) {
					for (Ammo b : shots.getList()) {
						if ((Math.abs( b.getX() - a.getX()) < 15 && Math.abs(b.getY() - a.getY() ) < 15)) { 
							a.setAlive(false);
							b.setVisible(false);
							shots.remove(b);
							horde.removeDeadOnes();
						}
					}
				}
				if (Math.abs(ship.getX() - a.getX()) < 15 && Math.abs(ship.getY() - a.getY()) < 15 || a.getY() >= 550) {
					loseflag = true;
					break;
				}
				
			}
			
			if (horde.size() == 0 && loseflag == false) {
				graphToBack.setColor(Color.WHITE);
				graphToBack.setFont(new Font("Helvetica", Font.PLAIN, 25));
				graphToBack.drawString("YOU WON",340,300);
				graphToBack.setColor(Color.BLACK);
			}
			
			if (loseflag == true) {
				for (Alien b : horde.getAliens()) {
					b.setAlive(false);
				}
				horde.removeDeadOnes();
				graphToBack.setColor(Color.WHITE);
				graphToBack.setFont(new Font("Helvetica", Font.PLAIN, 25));
				graphToBack.drawString("YOU LOST",340,300);
				graphToBack.setColor(Color.BLACK);
			}
			
			if (shots.getList().size() > 0) {
				bulletExist = true;
			}
			else {
				bulletExist = false;
			}
	
		
/*		
		//collision detection
		if (horde.size() != 0) {
			for (Alien a : horde.getAliens()) {
				//check if bullet collides with aliens
				for (Ammo b : shots.getBullets()) {
					if (bulletExist && Math.abs( shots.get(0).getX() - a.getX() ) < 15 && Math.abs( shots.get(0).getY() - a.getY() ) < 15) {
						a.setAlive(false);
					}
				}
				
				//check if aliens collide with ship or aliens collide with bottom of the screen
				if (Math.abs( ship.getX() - a.getX() ) < 15 && Math.abs( ship.getY() - a.getY() ) < 15 || a.getY() >= HEIGHT - 90) {
					lost = true;
					for (Alien b : horde.getAliens()) {
						b.setAlive(false);
					}
					horde.removeDeadOnes();
					
				}
			}
		}
		
		if (horde.size() == 0 && lost == true) {
			graphToBack.setColor(Color.WHITE);
			graphToBack.setFont(new Font("Helvetica", Font.PLAIN, 25));
			graphToBack.drawString("You Lost", WIDTH/2 - 50, HEIGHT/2 - 50);
		}
		
		if (horde.size() == 0 && lost == false) {
			graphToBack.setColor(Color.WHITE);
			graphToBack.setFont(new Font("Helvetica", Font.PLAIN, 25));
			graphToBack.drawString("You Won!", WIDTH/2 - 50, HEIGHT/2 - 50);
		}
		
		horde.removeDeadOnes();

	*/	
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
		if(keys[4] == true && pressed == true)
		{
			bulletExist = true;
			shots.add(new Ammo(ship.getX(), ship.getY(), 10));
			pressed = false;
		}
		
		
		

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
		if (e.getKeyCode() == KeyEvent.VK_SPACE && pressed == false)
		{
			pressed = true;
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
			pressed = false;
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
   		   Thread.currentThread().sleep(15);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
   
   
   
}

