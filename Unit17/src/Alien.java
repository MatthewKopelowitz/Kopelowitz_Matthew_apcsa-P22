//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private boolean alive;

	public Alien()
	{
		this(0,0,30,30,0);
		alive = true;
	}

	public Alien(int x, int y)
	{
		this.setX(x);
		this.setY(y);
		alive = true;
	}

	public Alien(int x, int y, int s)
	{
		this.setX(x);
		this.setY(y);
		setSpeed(s);
		alive = true;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed = s;
		alive = true;
		try
		{
			//URL url = getClass().getResource("/images/alien.jpg");
			image = ImageIO.read(new File("H:\\APCS\\Units\\Unit17\\Unit17_Assignments-starfighter\\Alien.JPG"));
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void setAlive(boolean bool) {
		alive = bool;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
   public void move(String direction)
	{
	   if (direction.equals("UP")) {
			setY(this.getY() - 1);
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

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
