//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		
	   String[] vowels = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
	   
	   for (int i = 0; i < vowels.length; i++) {
		   
		   if (a.substring(0,1).equals(vowels[i]) || (a.substring(a.length()-1).equals(vowels[i]))) {
			   
			   return "yes";
		  
		   } 
			   
			   
		   }   
		   
	   
	  
	   
	   return "no";
	}
}