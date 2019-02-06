//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		Scanner input = new Scanner(System.in);
		
		out.print("\nEnter a whole number :: ");
		int num1 = input.nextInt();
		System.out.println(num1 + " is odd :: " + NumberVerify.isOdd(num1));
		System.out.println(num1 + " is even :: " + NumberVerify.isEven(num1));
		
		out.print("\nEnter a whole number :: ");
		int num2 = input.nextInt();
		System.out.println(num2 + " is odd :: " + NumberVerify.isOdd(num2));
		System.out.println(num2 + " is even :: " + NumberVerify.isEven(num2));
		
		out.print("\nEnter a whole number :: ");
		int num3 = input.nextInt();
		System.out.println(num3 + " is odd :: " + NumberVerify.isOdd(num3));
		System.out.println(num3 + " is even :: " + NumberVerify.isEven(num3));

		out.print("\nEnter a whole number :: ");
		int num4 = input.nextInt();
		System.out.println(num4 + " is odd :: " + NumberVerify.isOdd(num4));
		System.out.println(num4 + " is even :: " + NumberVerify.isEven(num4));
		
		out.print("\nEnter a whole number :: ");
		int num5 = input.nextInt();
		System.out.println(num5 + " is odd :: " + NumberVerify.isOdd(num5));
		System.out.println(num5 + " is even :: " + NumberVerify.isEven(num5));
		
		
		
		
		
		//System.out.println("111 is odd :: " + NumberVerify.isOdd(111));
		//System.out.println("2000 is even :: " + NumberVerify.isEven(2000));
		//System.out.println("-99 is odd :: " + NumberVerify.isOdd(-99));
		//System.out.println("1111 is odd :: " + NumberVerify.isOdd(1111));
		//System.out.println("-850 is even :: " + NumberVerify.isEven(-850));
		
		
	}
}