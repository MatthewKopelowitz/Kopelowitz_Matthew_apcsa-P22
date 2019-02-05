//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0, 0, 0, 0);
		distance = 0;
	}

	public Distance(double x1, double y1, double x2, double y2)
	{
	
	}

	public void setCoordinates(double x1, double y1, double x2, double y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = sqrt( ((xTwo - xOne)*(xTwo - xOne)) + ((yTwo - yOne)*(yTwo- yOne)) ); 
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		out.println("distance == " + String.format("%.3f", distance));
		
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}