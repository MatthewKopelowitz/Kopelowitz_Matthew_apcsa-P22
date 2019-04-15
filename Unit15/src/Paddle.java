//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y) {
	   super(x, y);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int widt) {
	   super(x, y, widt);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int widt, int ht) {
	   super(x, y, widt, ht);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int widt, int ht, Color col) {
	   super(x, y, widt, ht, col);
	   speed = 5;
   }
   
   public Paddle(int x, int y, int widt, int ht, Color col, int spd) {
	   super(x, y, widt, ht, col);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int widt, int ht, int spd) {
	   super(x, y, widt, ht);
	   speed = spd;
   }





   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   this.setY(this.getY()-getSpeed());
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   this.setY(this.getY()+getSpeed());
	   draw(window);

   }

   //add get methods
   
   public int getSpeed() {
	   return speed;
   }
   
   
   //add a toString() method
   public String toString() {
	   String output = "" + super.toString() + " " + getSpeed();
	   return output;
   }
   
}