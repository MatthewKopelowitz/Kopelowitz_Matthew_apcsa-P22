//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	
	public Block()
	{
		setX(0);
		setY(0);
		setWidth(10);
		setHeight(10);
		setColor(Color.WHITE);
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x , int y) {
		setX(x);
		setY(y);
		setWidth(10);
		setHeight(10);
		setColor(Color.WHITE);
	}
	
	public Block(int x , int y, int widt) {
		setX(x);
		setY(y);
		setWidth(widt);
		setHeight(10);
		setColor(Color.WHITE);
	}
	
	public Block(int x , int y, int widt, int ht) {
		setX(x);
		setY(y);
		setWidth(widt);
		setHeight(ht);
		setColor(Color.WHITE);
	}
	
	
	public Block(int x, int y, int wd, int ht, Color colr) {
		setX(x);
		setY(y);
		setWidth(wd);
		setHeight(ht);
		setColor(colr);
	}
	
   //add the other set methods
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	
	public void setX(int x) {
		xPos = x;
	}

	
	public void setY(int y) {
		yPos = y;
	}

   public void setColor(Color col)
   {
	   color = col;
   }
   
   public void setWidth(int wid) {
	   width = wid;
   }
   
   public void setHeight(int ht) {
	   height = ht;
   }
   
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Block obj)
	{
		if (this.getX() == obj.getX() && this.getY() == obj.getY() && this.getWidth() == obj.getWidth() && this.getHeight() == obj.getHeight() && this.getColor() == obj.getColor()) {
			return true;
		}

		return false;
	}


   //add the other get methods
	public int getX() {
		
		return this.xPos;
	}

	public int getY() {
		
		return this.yPos;
	} 
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		String output = "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
		return output;
	}
}