//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   private int[] aValues;
   private int[] bValues = new int[1000000];
   private int a, b, c = 0;
   
	public Triples()
	{
		
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;
		
	}
/*	
	public boolean checkRepeats(int b) {
		
		
		for (int i : bValues) {
			
			if (b == bValues[i]) {
				
				return false;
			}
			
			return true;
		}
		
		
		return true;
	}
*/
	
	public int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 0;
		int min = Math.min(a, b);
		min = Math.min(min, c);
		
		for (int i = min; i >= 1; i--) {
			
			if ((a % i == 0) && (b % i == 0) && (c % i == 0)) {
				
				gcf = i;
				break;
			}
			
		}
		
		return gcf;
	}

	public String findNumbers() {
		
		double a = 1; 
		double b = 1;
		double c = 1;
		
		for (a = 1; a < number; a++) {
			
			for (b = 1; b < number; b++) {
				
				for (c = 1; c < number; c++) {
					
					if (( (((a % 2 == 0) && (b % 2 != 0)) || ((a % 2 != 0) && (b % 2 == 0))) && (c == Math.sqrt((a*a) + (b*b))) && (greatestCommonFactor((int)a, (int)b, (int)c) <= 1) && (b > a))) {
						
						out.println( (int)a + " " + (int)b + " " + (int)c);
						
						
						
					}	
					
					
				}
				
				
				
			}
		if (a == number - 1) {break;}
		}
		
		return "";
	}
	
	
	
	public void findAllNumbers() {
		
		//int a = 0;
		//int b = 0;
		//int c = 0;
		int beg = 2;
		 
		
		while (c < number) {
			
			for (int i = 1; i < beg; ++i) {
				
				a = (beg*beg) - (i*i);
				b = 2*beg*i;
				c = (beg*beg) + (i*i);
				
				if (c > number) {
					break;
				}
				
				out.println(a + " " + b + " " + c);
				
			}
 			
			beg++;
			
		}
		
		
	}
	
	
	
	public String toString()
	{
		String output= findNumbers();






		return output+"\n";
	}
}