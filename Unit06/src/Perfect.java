//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   
   public Perfect() {
	   
	   setNumber(0);
	   
   }
   
   public Perfect(int n) {
	   
	   setNumber(n);
	   
   }

	//add a set method
   
   public void setNumber(int n) {
	   
	   number = n;
	   
   }
   
   

	public boolean isPerfect()
	{
		int count = 0;
		
		for (int i = 1; i < number; i++) {
			
			if (number % i == 0) {
				
				count = count + i;
				
			}
			
			
		}
		
		
		if (count == number) {
			
			return true;
		} else {
		
			return false;
		
		}
	}

	//add a toString
	
	public String toString() {
		
		if (isPerfect() == true) {
			
			return number + " is perfect.\n";
			
		}
		
		if (isPerfect() == false) {
			
			return number + " is not perfect.\n";
			
		} else {
			
			return "";
		}
		
		
		
	}
	
	
}