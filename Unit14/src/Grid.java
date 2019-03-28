//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;
public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		//ArrayList<Integer> randomNums = new ArrayList<>();
		int randNum = (int)(Math.random() * vals.length);
		//randomNums.add(randNum);
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				//for (int num : randomNums) {
					//while (randNum == num) {
						randNum = (int)(Math.random() * vals.length);
					//}
				//}
				grid[r][c] = vals[randNum];
				//randomNums.add(randNum);
			}
		}	
	}

	//find out which of the vals occurs the most
	public String findMax()
	{
		String freq = grid[0][0];
		for (String[] row : grid) {
			for (String str : row) {
				if (countVals(str) > countVals(freq)) {
					freq = str;
				}
			}
		}
		
		return freq;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{	
		int count = 0;
		for (String[] row : grid) {
			for (String str : row) {
				if (str.equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (String[] row : grid) {
			for (String str : row) {
				output += str + " ";
			}
			output += "\n";
		}
		return output + "\n" + findMax() + " occurs the most.";
	}
}