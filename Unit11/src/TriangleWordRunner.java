//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		String more = "";
		
		do {
		Scanner input = new Scanner(in);
		String word = "";
		TriangleWord test = new TriangleWord();
		
		System.out.print("Enter a word :: ");
		word = input.next();
		
		test.printTriangle(word);
		
		System.out.print("\nDo you want to ener more sample inputs?");
		more = input.next();
		
		System.out.println("");
		
		} while (more.equals("y"));
	}
}