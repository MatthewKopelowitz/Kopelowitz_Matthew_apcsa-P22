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
		Grid grid = new Grid(3, 3, new String[] {"max", "sucks", "big", "epic", "balloon", "hi", "jack", "queen", "zhanyu"});
		
		System.out.println(grid);
	}
}