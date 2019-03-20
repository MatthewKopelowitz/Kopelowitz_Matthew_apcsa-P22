//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter 1st monster's name : ");
		String firstMonsterName = keyboard.next();
		
		System.out.print("Enter 1st monster's size : ");
		int firstMonsterSize = keyboard.nextInt();
		
		System.out.print("Enter 2st monster's name : ");
		String secondMonsterName = keyboard.next();
		
		System.out.print("Enter 2st monster's size : ");
		int secondMonsterSize = keyboard.nextInt();
		
		Skeleton first = new Skeleton(firstMonsterName, firstMonsterSize);
		Skeleton second = new Skeleton(secondMonsterName, secondMonsterSize);
		
		System.out.println("\nMonster 1 - " + first);
		System.out.println("Monster 2 - " + second);
		
		if (first.isBigger(second)) {
			System.out.println("\nMonster one is bigger than Monster two.");
		} else {
			System.out.println("\nMonster one is smaller than Monster two.");
		}
		
		if (first.namesTheSame(second)) {
			System.out.println("Monster one has the same name as Monster two.");
		} else {
			System.out.println("Monster one does not have the same name as Monster two.");
		}
		
	}
}