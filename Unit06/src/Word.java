//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirstChar()
	{
		
		return word.substring(0,1);
	}

	public String getLastChar()
	{
		return word.substring((word.length()-1), word.length());
	}

	public String getBackWards()
	{
		String back="";
		
		for (int i = (word.length()-1); i > -1; i--) {
			
			back = back + word.charAt(i);
			
		}
		
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n\n";
 		
	}
}