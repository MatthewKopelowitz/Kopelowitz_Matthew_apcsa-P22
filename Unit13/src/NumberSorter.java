//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown
	
	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int[] newSorted = new int[getNumDigits(number)];
		int num = number;
		for (int i = sorted.length-1; i > -1; i--) {
			int newNumber = num % 10;
			num = num / 10;
			sorted[i] = newNumber;
		}
		
		int small = sorted[0];
		int index = 0;
		for (int k = 0; k < sorted.length; k++) {
			for (int n = 0; n < sorted.length; n++) {
				if (sorted[n] < small) {
					small = sorted[n];
					index = n;
				}
				
			}
			newSorted[k] = small;
			
		}

		return newSorted;
	}
}