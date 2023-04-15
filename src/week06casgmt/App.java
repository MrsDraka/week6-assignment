
package week06casgmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner usrChoice = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("Do you wish to play a new War game?");
			System.out.println("Enter y for yes or n for no: ");
			String input = usrChoice.nextLine();
			
			if(input.equals("y")) {

			Deck newDeck = new Deck();
			
			/*
			 * for (Card card: newDeck.cardsList) { card.describeCard(); }
			 */
			
			System.out.println("Please enter a name for Player 1: ");
			String p1Name = usrChoice.nextLine();
			System.out.println("Please enter a name for Player 2: ");
			String p2Name = usrChoice.nextLine();
			
			System.out.println("Initializing game...");
			
			List <Card> p1Hand = new ArrayList <Card>();
			List <Card> p2Hand = new ArrayList <Card>();
			
			Player playerOne = new Player (p1Name, p1Hand);
			Player playerTwo = new Player (p2Name, p2Hand);
			
			System.out.println("Shuffling...");
			newDeck.shuffleCards();
			
			System.out.println("Dealing cards...");
			for (int i = 0; i<52; i++) {
				
				if (i%2 ==0) {
					p1Hand.add(newDeck.draw());
				}
				
				else {
					p2Hand.add(newDeck.draw());
				}
				
			}
				
				for (int c= 1;c<27; c++) {
										
					System.out.println("Round " + c + ":");
					Card card1 = playerOne.flip();
					System.out.println(playerOne.getName() + ":");
					card1.describeCard();
					Card card2 = playerTwo.flip();
					System.out.println(playerTwo.getName() + ":");
					card2.describeCard();
					
					if (card1.getValue() > card2.getValue()) {
						playerOne.incrementScore();
						System.out.println("Player 1 [" + playerOne.getName() + "] won this round.");
					} else if (card1.getValue() < card2.getValue()) {
						playerTwo.incrementScore();
						System.out.println("Player 2 [" + playerTwo.getName() + "] won this round.");
					} else {
						System.out.println("No points. It's a draw.");
					}
					
				}
				
				System.out.println("The final score is: ");
				System.out.println("Player 1 - " + playerOne.getName() + ": " + playerOne.getScore());
				System.out.println("Player 2 - " + playerTwo.getName() + ": " + playerTwo.getScore());
				if (playerOne.getScore() > playerTwo.getScore()) {
					System.out.println("Player " + playerOne.getName() + " wins!");
				} else if (playerOne.getScore() < playerTwo.getScore()) {
					System.out.println("Player " + playerTwo.getName() + " wins!");
				} else {
					System.out.println("It's a draw!");
				}


			
			
			
	
			} else if (input.equals("n")) {
				System.out.println("Good bye.");
				break;
			} else {
				System.out.println("Sorry, that was not a valid entry.");
			}
		}
		usrChoice.close();
	}
	
}

