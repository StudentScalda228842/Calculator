import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	public static ArrayList<Card> cards = new ArrayList<>();


	public Deck() {

		String suit = "";
		for (int i = 1; i <= 4; i++) {
			switch (i) {
			case 1:
				suit = "Spades";
				break;
			case 2:
				suit = "Hearts";
				break;
			case 3:
				suit = "Clubs";
				break;
			case 4:
				suit = "Diamonds";
				break;

			}

			for (int j = 2; j <= 10; j++) {

				Card C = new Card(suit, j + " of " + suit, j);
				cards.add(C);
			}

			Card jack = new Card(suit, "jack" + " of " + suit, 11);
			Card queen = new Card(suit, "queen" + " of " + suit, 12);
			Card king = new Card(suit, " king " + " of " + suit, 13);
			Card ace = new Card(suit, "ace of " +suit, 1);
			cards.add(jack);
			cards.add(queen);
			cards.add(king);
			cards.add(ace);

			Collections.shuffle(cards);

		}
	}

	public Card getNextCard() {
		Card nextCard = cards.remove(0);
		return nextCard;

	}

	public ArrayList<Card> getCards() {
		cards.get(0);
		return cards;
	}
}