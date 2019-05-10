//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde()
	{
		aliens = new ArrayList<Alien>();
	}
	
	public Alien get(int i) {
		return aliens.get(i);
	}
	
	public void add(Alien al)
	{
		aliens.add(al);
	}
	
	public void remove(int i) {
		aliens.remove(i);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a : aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll(String direction, Graphics window)
	{
		for (Alien a : aliens) {
			a.move2(direction, window);
		}
	}

	public void removeDeadOnes()
	{
		for (Alien a : aliens) {
			if (a.getAlive() == false) {
				aliens.remove(a);
			}
		}
	}
	
	public int size() {
		return aliens.size();
	}

	public String toString()
	{
		return "";
	}
}
