package activity4;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		Deck deck1 = new Deck(new String[] {"A", "B", "C"}, new String[] {"Giraffes", "Lions"}, new int[] {2,1,6});
		Deck deck2 = new Deck(new String[] {"A", "B", "C"}, new String[] {"Giraffes", "Lions"}, new int[] {2,1,6});
		Deck deck3 = new Deck(new String[] {"A", "B", "C"}, new String[] {"Giraffes", "Lions"}, new int[] {2,1,6});
		

		System.out.println(deck1.isEmpty());
		System.out.println(deck2.isEmpty());
		System.out.println(deck3.isEmpty());
		
		System.out.println(deck1.size());
		System.out.println(deck2.size());
		System.out.println(deck3.size());
		
		System.out.println(deck1.deal());
		System.out.println(deck2.deal());
		System.out.println(deck3.deal());
		
		
		Deck standard = new Deck(new String[] {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}, new String[] {"Spades", "Hearts", "Diamonds", "Clubs"}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10, 11, 12 ,13});
		
		System.out.print(standard);
		standard.shuffle();
		standard.printCards();
	
	}
}
