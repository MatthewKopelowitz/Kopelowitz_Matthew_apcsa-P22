//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Discount discount = new Discount();
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.print("Bill after discount :: " + discount.getDiscountedBill(amt));
		
		out.print("\n\nEnter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		out.print("Bill after discount :: " + discount.getDiscountedBill(amt1));
		
		out.print("\n\nEnter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		out.print("Bill after discount :: " + discount.getDiscountedBill(amt2));
		
		out.print("\n\nEnter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		out.print("Bill after discount :: " + discount.getDiscountedBill(amt3));
		
		out.print("\n\nEnter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		out.print("Bill after discount :: " + discount.getDiscountedBill(amt4));
		
		

	}
}