package week06casgmt;

import java.util.HashMap;

public class Card {
	
	private int value;
	private String name;
	private String suit;
	private HashMap<String, String> cardSuits = new HashMap<>();
		
	
	// Constructor, I don't know if I need it yet
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	//Setters and getters
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int val) {
		this.value = val;
	}
	
	public String getSuit () {
		return suit;
	}
	
	public void setSuit (String suit) {
		this.suit = suit;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Describe method
	
	public void describeCard() {
		
		cardSuits.put("Spades", "\u2660");
		cardSuits.put("Clubs", "\u2663");
		cardSuits.put("Hearts", "\u2665");
		cardSuits.put("Diamonds", "\u2666");
				
		System.out.println("[" + name + cardSuits.get(suit) + "] " +   name + " of " + suit);
	}
	
	

}
