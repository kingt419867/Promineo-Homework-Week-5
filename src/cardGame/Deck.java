package cardGame;
import java.util.*;

public class Deck {
	List<Cards> cards = new ArrayList<Cards>();
	
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Cards card = new Cards(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	}

	public List<Cards> getCards() {
		return cards;
	}

	public void setCards(List<Cards> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (Cards card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Cards draw() {
		Cards card = this.cards.remove(0);
		return card;
	}
}
