//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", '\u0000');
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		
		setRemover(s, rem);
		
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		
		
		while (sentence.indexOf(lookFor) > -1) {
			
			sentence.replace(lookFor, '\u0000');
		}
		
		String cleaned=sentence;
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}