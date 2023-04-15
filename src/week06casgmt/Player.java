package week06casgmt;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	//Constructor 
	
	public Player(String name, List<Card> hand) {
		
		this.name = name;
		this.score = 0;
		this.hand = hand;
		
	}
	
	public void describe() {
		System.out.println("Player " + name + " has a score of " + score);
		System.out.println("Cards available: ");
		for (int i = 0; i<hand.size(); i++) {
			hand.get(i).describeCard();
		}
	}
	
	public String getName () {
		return name;
	}
	
	public int getScore () {
		return score;
	}
	
	public Card flip() {
		
        if (this.hand.size() > 0) {
            Card flipCard = this.hand.get(0);
            this.hand.remove(0);
            return flipCard;
        } else {
            return null;
        }
	}
	
    public void incrementScore() {
    	this.score += 1;
    }
    
    public void draw (Deck cards) {
    	Card newCard = cards.draw();
    	this.hand.add(newCard);
    }
}
