//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
	static int[][] l;
	
	public TotalRow() {
		setMatrix(null);
	}
	
    public TotalRow(int[][] n) {
    	setMatrix(n);
    }
	
    public void setMatrix(int[][] r) {
    	l = r;
    }
    
	public static List<Integer> getRowTotals()
    {
    	//add code here
    	ArrayList<Integer> output = new ArrayList<>();
    	
    	for (int[] row : l) {
    		int count = 0;
    		for (int num : row) {
    			count = num + count;
    		}
    		output.add(count);
    	}
    	
    	return output;
    }
    
    public String toString() {
    	String output = "Row totals are :: " + getRowTotals();
    	return output;
    }
    
}
