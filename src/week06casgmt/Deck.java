package week06casgmt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card>  cardsList = new ArrayList<Card>();
	
	//Constructor
	
	public Deck() {
		
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		
		
		int[] values = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		String[] names = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for (String suit : suits) {
			for (int i = 0; i < names.length; i++) {
				Card card = new Card(names[i], suit, values[i]);
				cardsList.add(card);
			}
		}
	}
	
	public void shuffleCards() {
        Collections.shuffle(this.cardsList);
	}
	
	public Card draw() {
        if (this.cardsList.size() > 0) {
            Card drawCard = this.cardsList.get(0);
            this.cardsList.remove(0);
            return drawCard;
        } else {
            return null;
        }
	}
}
