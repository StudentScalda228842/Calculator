import java.util.Scanner;

public class Game {

	static Deck deck = new Deck();
	static Scanner sc = new Scanner(System.in);
	static Card currentCard;
	static Card nextCard;
	static int score;

	public static void main(String[] args) {
		nextCard = deck.getNextCard();
		currentCard = deck.getNextCard();

		gameTurn();
	}

	public static void gameTurn() {

		System.out.println(currentCard);
		System.out.println("Is the next card higher or lower?");
		String answer = sc.nextLine();
		currentCard = deck.getNextCard();
		if (answer.equals("higher") && nextCard.isHigherOrEqual(currentCard)) {
			correct();
		} else if (answer.equals("lower") && !nextCard.isHigherOrEqual(currentCard)) {
			correct();
		} else {
			gameOver();
		}
	}

	public static void gameOver() {
		System.out.println("Wrong!");
		System.out.println("Your score is: " + score);
	}

	public static void correct() {
		System.out.println("Current Score: " + score);
		score++;
		gameTurn();

	}

}
