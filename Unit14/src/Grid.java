//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		
		for (int n = 0; n < cols; n++) {
			for (int i = 0; i < rows; i++) {
				grid[i][(int)Math.random() * cols] = vals[i];
			}
		}	
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		for (String[] row : grid) {
			for (String str : row) {
				
			}
		}
		
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		return 0;
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
		return output;
	}
}