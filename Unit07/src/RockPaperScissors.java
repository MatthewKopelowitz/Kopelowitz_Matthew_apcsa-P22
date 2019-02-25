//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private char playChoice;
	private char compChoice;
	private String outcome;

	public RockPaperScissors()
	{
		
	}

	public RockPaperScissors(String player)
	{
	}

	public void setPlayers(char p)
	{
		playChoice = p;
		int rand = (int)(3 * Math.random());
		switch(rand) {
		case 0 : compChoice = 'R';
			break;
		case 1 : compChoice = 'P';
			break;
		case 2 : compChoice = 'S';
			break;
		}
	
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice == 'R' && compChoice == 'R') {
			winner = "noone";
		} else if (playChoice == 'R' && compChoice == 'P') {
			winner = "Computer";
			outcome = "Paper Covers Rock";
		} else if (playChoice == 'R' && compChoice == 'S') {
			winner = "Player";
			outcome = "Rock Breaks Scissors";
		} else if (playChoice == 'P' && compChoice == 'R') {
			winner = "Player";
			outcome = "Paper Covers Rock";
		} else if (playChoice == 'P' && compChoice == 'P') {
			winner = "noone";
		} else if (playChoice == 'P' && compChoice == 'S') {
			winner = "Computer";
			outcome = "Scissors Cuts Paper";
		} else if (playChoice == 'S' && compChoice == 'R') {
			winner = "Computer";
			outcome = "Rock Breaks Scissors";
		} else if (playChoice == 'S' && compChoice == 'P') {
			winner = "Player";
			outcome = "Scissors Cuts Paper";
		} else if (playChoice == 'S' && compChoice == 'S') {
			winner = "noone";
		}   
		
		return winner;
	}

	public String toString()
	{
		String output = "";
		
		if (determineWinner() == "Player") {
			output="player had " + playChoice + "\ncomputer had " + compChoice + " !Player wins <<" + outcome + ">>!";
		}
		
		if (determineWinner() == "Computer") {
			output="player had " + playChoice + "\ncomputer had " + compChoice + " !Computer wins <<" + outcome + ">>!";
		}
		
		if (determineWinner() == "noone") {
			output="player had " + playChoice + "\ncomputer had " + compChoice + " !Draw Game!";
		}
		
		return output;
	}
}