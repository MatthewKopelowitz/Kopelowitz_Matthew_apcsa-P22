//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int xSpd, int ySpd) {
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
	public Ball(int x, int y, int xSpd, int ySpd) {
		super(x, y);
		xSpeed = xSpd;
		ySpeed = ySpd;
		
	}
	   
	public Ball(int x, int y, int widt, int xSpd, int ySpd) {
		super(x, y, widt);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	   
	public Ball(int x, int y, int widt, int ht, int xSpd, int ySpd) {
		super(x, y, widt, ht);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	   
	public Ball(int x, int y, int widt, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, widt, ht, col);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
	
	   
   //add the set methods
   
	public void setXSpeed(int xSpd) {
		xSpeed = xSpd;
	}
	
	public void setYSpeed(int ySpd) {
		ySpeed = ySpd;
	}
	
	
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.WHITE);
	   setX(getX() + xSpeed);
	   setY(getY() + ySpeed);
	   draw(window);      	
   }
   
	public boolean equals(Ball obj)
	{
		if (getX() == obj.getX() && getY() == obj.getY() && getWidth() == obj.getWidth() && getHeight() == obj.getHeight() && getColor() == obj.getColor()) {
			return true;
		}

		return false;
	}   

   //add the get methods
	
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

   //add a toString() method
	public String toString() {
		String output = "" + super.toString() + " " + getXSpeed() + " " + getYSpeed();
		return output;
	}
	
}