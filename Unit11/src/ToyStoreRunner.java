//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore store = new ToyStore();
		
		store.loadToys("Buzz");
		store.loadToys("Buzz");
		store.loadToys("Andy");
		store.loadToys("Woody");
		store.loadToys("Potato-Head");
		store.loadToys("Potato-Head");
		store.loadToys("Slinky");
		store.loadToys("Buzz");
		store.loadToys("Potato-Head");
		store.loadToys("Potato-Head");
		store.loadToys("Potato-Head");
		
		
		System.out.println(store);
	}
}