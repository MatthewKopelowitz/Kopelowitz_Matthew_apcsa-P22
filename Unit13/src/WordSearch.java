//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int counter = 0;
    	m = new String[size][size];
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			m[i][j] = str.substring(counter,counter + 1);
    			counter++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	boolean output = false;
    	
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m.length; j++) {
    			if (output == true) {
    				return output;
    			}
    			output = checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagDownRight(word, i, j) || checkDiagDownLeft(word, i, j);
    		}
    	}
    	return checkDiagUpRight("ALG", 2, 2);
    }

	public boolean checkRight(String w, int r, int c)
   {
		String letters = "";
		for (int i = c; i < m.length; i++) {
			letters = letters + m[r][i];
		}
		if (letters.contains(w))
			return true;
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String letters = "";
		for (int i = c; i >= 0; i--) {
			letters = letters + m[r][i];
		}
		if (letters.contains(w))
			return true;
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String letters = "";
		for (int i = r; i >= 0; i--) {
			letters = letters + m[i][c];
		}
		if (letters.contains(w))
			return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String letters = "";
		for (int i = r; i < m.length; i++) {
			letters = letters + m[i][c];
		}
		if (letters.contains(w))
			return true;
		return false;
	
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String letters = "";
		for (int i = c; i < m.length; i++) {
			if (r > -1 && i > -1) {
				letters = letters + m[r][i];
				r = r - 1;
			}
		}
		if (letters.contains(w))
			return true;
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String letters = "";
		for (int i = 0; i < m.length; i++) {
			if (r - i == -1 || c - i < 0) {
				break;
			}
			letters = letters + m[r-i][c-i];
		}
		if (letters.contains(w))
			return true;
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String letters = "";
		for (int i = 0; i < m.length; i++) {
			if (r + i >= m.length || c - i < 0) {
				break;
			}
			letters = letters + m[r+i][c-i];
		}
		if (letters.contains(w))
			return true;
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String letters = "";
		for (int i = 0; i < m.length; i++) {
			if (r + i >= m.length || c + i >= m.length) {
				break;
			}
			letters = letters + m[r+i][c+i];
		}
		if (letters.contains(w))
			return true;
		return false;
	}

    public String toString()
    {
    	String output = "";
    	for (String[] row : m) {
    		for (String str : row) {
    			output += str + " ";	
    		}
    		output = output + "\n";
    	}
    		
 		return output;
    }
}
