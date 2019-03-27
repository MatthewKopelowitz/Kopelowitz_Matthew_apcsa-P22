//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid grid = new Grid(3, 3, new String[] {"m", "s", "b", "e", "b", "h", "j", "q", "z"});
		
		System.out.println(grid);
	}
}