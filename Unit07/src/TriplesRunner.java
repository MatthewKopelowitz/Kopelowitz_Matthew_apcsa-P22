//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner input = new Scanner(in);
	   
	   Triples test = new Triples();
	   
	   test.setNum(input.nextInt());
	   
	   //test.findNumbers();
	   
	   out.print(test);
   
   }
}