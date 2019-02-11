//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		
	   //String abe = "abe", ape = "ape", giraffe = "giraffe", gorilla = "gorilla", one = "one", two = "two", fun = "fun", funny = "funny", ;
	   
	   WordsCompare compare = new WordsCompare();
	   
	   compare.setWords("abe", "ape");
	   System.out.println(compare);
	   
	   compare.setWords("giraffe", "gorilla");
	   System.out.println(compare);
	   
	   compare.setWords("one", "two");
	   System.out.println(compare);
	   
	   compare.setWords("fun", "funny");
	   System.out.println(compare);
	   
	   compare.setWords("19", "123");
	   System.out.println(compare);
	   
	   compare.setWords("193", "1910");
	   System.out.println(compare);
	
	   compare.setWords("goofy", "godfather");
	   System.out.println(compare);
	   
	   compare.setWords("funnel", "fun");
	   System.out.println(compare);
	   
	}
}