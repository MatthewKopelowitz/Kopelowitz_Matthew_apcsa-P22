//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees( long number )
	{
		int count = 0;
		
		if (number == 0) {
			return 0;
		}
		
		if (number == 3) {
			count++;
		}
		
		long first = number % 10;
		long last = number / 10;
		
		if (first == 3 && count > 0) {
			return 0 + luckyThrees(last);
		} else if (first == 3) {
			return 1 + luckyThrees(last);
		} else {
			return 0 + luckyThrees(last);
		}
	
	}
}