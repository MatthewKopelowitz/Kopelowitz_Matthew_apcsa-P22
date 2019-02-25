//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		
		
	}

	public TriangleFive(char chr, int amt)
	{
		setChar(chr);
		setAmount(amt);
	
	}

	public void setChar(char chr) 
	{
	
	letter = chr;
	
	}

	public void setAmount(int amt)
	{
		amount = amt;
		
		
	}
	
	public String assemble() {
		
		for (int i = amount; i > 0; i--) {
			
			for (int n = 0; n < i; n++) {
				
				for (int k = amount - n; k > 0; k--) {
					
					int ascii = letter + n;
					
					if (ascii > 90) {
						
						out.print((char)(letter + n - 26));
						
					} else {
						
						out.print((char)(letter + n));
						
					}
					
				}
				
				out.print(" ");
				
			}
			
			out.print("\n");
			
		}
		
		return "";
		
	}
	
	
	

	public String toString()
	{
		
		String output= assemble();
		
		
		return output;
	}
}