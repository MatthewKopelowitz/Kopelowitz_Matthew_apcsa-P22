//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	private static int evenCount = 0;
	
	public static int countEvenDigits(int num)
	{

		if (num == 0) {
			return 0;
		} 
		
		int last = num % 10;
		int first = num / 10;
		
		if (last % 2 == 0) {
			return 1 + countEvenDigits(first);
		} else {
			return 0 + countEvenDigits(first);
		}
		
		
		
		
/*
		String number = "" + num;
		
		if ((int)number.charAt(0) > 0) {
			if ((int)number.charAt(0) % 2 != 0) {
				oddCount++;
			}
			if (number.length() >= 2) {
				String str = number.substring(1, number.length());
				countOddDigits(Integer.parseInt(str));
			}
			String str = number.substring(1, number.length()+1);
			System.out.println(str);
			countOddDigits(Integer.parseInt(str));
		}
		
		return oddCount;
*/
	}
}