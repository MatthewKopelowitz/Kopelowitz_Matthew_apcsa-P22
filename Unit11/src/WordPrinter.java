//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	private static String word = "";
	private static int times = 0;
	
	public WordPrinter(String wrd, int num) {
		
		word = wrd;
		times = num;
		
	}
	
	
	public static void printWord()
	{
		for (int i = 0; i < times; i++) {
			
			System.out.println(word);
		}
		
		
	}
}