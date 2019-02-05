//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter X1 :: ");
		double x1 = keyboard.nextInt();
		
		out.print("Enter X2 :: ");
		double x2 = keyboard.nextInt();
		
		out.print("Enter Y1 :: ");
		double y1 = keyboard.nextInt();
		
		out.print("Enter Y2 :: ");
		double y2 = keyboard.nextInt();
		
		
		Distance totalDistance = new Distance();
		totalDistance.setCoordinates(x1, y1, x2, y2);
		totalDistance.calcDistance(); 
		totalDistance.print();
		
		
	}
}