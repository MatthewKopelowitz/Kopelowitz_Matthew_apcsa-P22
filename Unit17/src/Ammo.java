//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private boolean visible;

	public Ammo()
	{
		this(0,0,0);
		visible = true;
		speed = 1;
	}

	public Ammo(int x, int y)
	{
		this.setX(x);
		this.setY(y);
		visible = true;
		speed = 1;
	}

	public Ammo(int x, int y, int s)
	{
		this.setX(x);
		this.setY(y);
		speed = s;
		visible = true;
		
	}
	
	public void setVisible(boolean bool) {
		visible = bool;
	}
	
	public boolean isVisible() {
		return visible;
	}
	
	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(this.getX()+20, this.getY(), 10, 10);
	}
	
	public void draw2( Graphics window, Color col )
	{
		window.setColor(col);
		window.fillRect(this.getX()+20, this.getY(), 10, 10);
	}
	
	
	public void move( String direction)
	{
		if (direction.equals("UP")) {
			this.setY(this.getY() - 1);
		}
		
		if (direction.equals("DOWN")) {
			setY(this.getY() + 1);
		}
		
		if (direction.equals("LEFT")) {
			setX(this.getX() - 1);
		}
		
		if (direction.equals("RIGHT")) {
			setX(this.getX() + 1);
		}
	}
	
	public void move2( String direction, Graphics window)
	{
		if (direction.equals("UP")) {
			this.draw2(window, Color.BLACK);
			this.setY(this.getY() - this.speed);
			this.draw2(window, Color.YELLOW);
			
		}
		
		if (direction.equals("DOWN")) {
			setY(this.getY() + this.speed);
		}
		
		if (direction.equals("LEFT")) {
			setX(this.getX() - this.speed);
		}
		
		if (direction.equals("RIGHT")) {
			setX(this.getX() + this.speed);
		}
	}
	
	public String toString()
	{
		return "";
	}
}
