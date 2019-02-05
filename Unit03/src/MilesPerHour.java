//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}
	
	public MilesPerHour(double dist, double hrs, double mins)
	{
		setNums(dist, hrs, mins);
		double minIntoHours = ( minutes / 60 );
		double distance = dist;
		mph = (int)( distance / ( hrs + (minIntoHours) ) );
		
	}

	public void setNums(double dist, double hrs, double mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		
	}

	public void calcMPH()
	{
		double minIntoHours = (minutes / 60);
		double totalHours = hours + minIntoHours;
		double distanceDouble = distance;
		mph = ( distanceDouble / ( totalHours ) );
		
	
	}

	public void print()
	{
		out.println((int)distance + " miles in " + (int)hours + " hours and " + (int)minutes + " minutes = " + String.format("%.0f", mph) + " MPH");
	
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}