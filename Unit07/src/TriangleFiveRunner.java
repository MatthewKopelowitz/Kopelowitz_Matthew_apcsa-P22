//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
   
	   char chr;
	   int amt;
	   
	   Scanner input = new Scanner(in);
	   
	   TriangleFive test = new TriangleFive();
	  
	   
	   out.print("Please enter a character :: \n");
	   chr = input.next().charAt(0);
	   
	   out.print("Please enter a number :: \n");
	   amt = input.nextInt();
	   
	 
	   test.setChar(chr);
	   test.setAmount(amt);  
	   
	   out.println(test);
   
   
   }
}