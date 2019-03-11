//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	
	public static int go(List<Integer> list)
	{
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i) > list.get(0)) {
				
				sum = sum + list.get(i);
				
			}
			
		}
		
		if (sum == 0) {
			
			return -1;
		}
		
		return sum;
	}
	
	
	
}