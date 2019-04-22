//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int lscore;
	private int rscore;


	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(10, 100, 10, 10, Color.BLUE, 2, 1);
		leftPaddle = new Paddle(20, 200, 10, 40, Color.ORANGE, 2);
		rightPaddle = new Paddle(760, 200, 10, 40, Color.ORANGE, 2);
		keys = new boolean[4];
		lscore = 0;
		rscore = 0;

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.setColor(Color.LIGHT_GRAY);
		graphToBack.fillRect(250, 450, 200, 100);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Player 1: " + Integer.toString(lscore), 260, 500);
		graphToBack.drawString("Player 2: " + Integer.toString(rscore), 350, 500);


		//Collide left wall or right wall
		if (didCollideRight()) {
			ball.setYSpeed(/*ball.getYSpeed()*/0);
			ball.setXSpeed(/*-ball.getXSpeed()*/0);
			lscore++;
			graphToBack.setColor(Color.LIGHT_GRAY);
			graphToBack.fillRect(250, 450, 200, 100);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Player 1: " + Integer.toString(lscore), 260, 500);
			graphToBack.drawString("Player 2: " + Integer.toString(rscore), 350, 500);
			graphToBack.setColor(Color.WHITE);
			graphToBack.fillRect(ball.getX(), ball.getY(), 10, 10);
			ball = null;
			ball = new Ball(350, 250, 10, 10, Color.BLUE, rand(), rand());

		}

		
		if (didCollideLeft()) {
			ball.setYSpeed(/*ball.getYSpeed()*/0);
			ball.setXSpeed(/*-ball.getXSpeed()*/0);
			rscore++;
			graphToBack.setColor(Color.LIGHT_GRAY);
			graphToBack.fillRect(250, 450, 200, 100);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Player 1: " + Integer.toString(lscore), 260, 500);
			graphToBack.drawString("Player 2: " + Integer.toString(rscore), 350, 500);
			graphToBack.setColor(Color.WHITE);
			graphToBack.fillRect(ball.getX(), ball.getY(), 10, 10);
			ball = null;
			ball = new Ball(350, 250, 10, 10, Color.BLUE, rand(), rand());


		}
		
		//Collide Top or Bottom Wall
		if (didCollideTop() || didCollideBottom()) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		
		//see if the ball hits the left paddle
		
		if (didLCollidePaddle(leftPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits the right paddle
		
		if (didRCollidePaddle(rightPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
			ball.setXSpeed(-ball.getXSpeed());
		}
		
	


		//see if the paddles need to be moved
		
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		
		
		


		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
   
   //Collision Detection
   public boolean didCollideLeft() {
	   if (ball.getX() < 1) {
		   return true;
	   }
	   return false;
   }
   
   public boolean didCollideRight() {
	   if (ball.getX() > 780) {
		   return true;
	   }
	   return false;
   }
   
   public boolean didCollideTop() {
	   if (ball.getY() < 1) {
		   return true;
	   }
	   return false;
   }
   
   public boolean didCollideBottom() {
	   if (ball.getY() > 550) {
		   return true;
	   }
	   return false;
   }
   
   
   
   public boolean didLCollidePaddle(Paddle n) {
	   if (ball.getY() >= n.getY() && ball.getY() <= (n.getY() + n.getHeight()) && ball.getX() <= n.getX() + n.getWidth()) {
		   return true;
	   }
	   return false;
   }
   
   public boolean didRCollidePaddle(Paddle n) {
	   if (ball.getY() >= n.getY() && ball.getY() <= (n.getY() + n.getHeight()) && ball.getX() >= n.getX() - n.getWidth()) {
		   return true;
	   }
	   return false;
   }
   
   public int rand() {
	   int output = (int)(Math.floor((Math.random()*7) - 3));
	   if (output >= -1 && output <=1) {
		   return 2;
	   } else {
		   return output;
	   }
   }
   
}