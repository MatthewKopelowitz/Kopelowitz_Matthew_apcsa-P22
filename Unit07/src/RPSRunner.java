//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		char again;
		
		
		//add in a do while loop after you get the basics up and running
		do {
			RockPaperScissors game = new RockPaperScissors();
		
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
			
			game.setPlayers(keyboard.next().charAt(0));
			
			out.print(game + "\n\nDo you want to play again?");
			again = keyboard.next().charAt(0);
			out.print("\n");
			
		} while (again == 'y');
			
			
				
	}
}



