/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 */
/*Comment by shweta on git remote repo  to perform fetch operation*/
/*Final commit to learn commit*/
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
          //  c.setValue;//(insert call to random number generator here)
          //  c.setSuit;//(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
          Scanner reader = new Scanner(System.in); 
        System.out.print("Kindly Select your Suit from ['Clubs','Diamonds','Hearts','Spades'] ");
        String suit=reader.nextLine();
       // Reading from System.in
        System.out.println("Enter a rank: ");
        int rank = reader.nextInt();

        // and search magicHand here
        System.out.print("The card you picked is ");
		switch(rank) // Get rank
		{
			case 1: System.out.print("Ace"); break;
			case 2: System.out.print(rank); break;
			case 3: System.out.print(rank); break;
			case 4: System.out.print(rank); break;
			case 5: System.out.print(rank); break;
			case 6: System.out.print(rank); break;
			case 7: System.out.print(rank); break;
			case 8: System.out.print(rank); break;
			case 9: System.out.print(rank); break;
			case 10: System.out.print(rank); break;
			case 11: System.out.print("Jack"); break;
			case 12: System.out.print("Queen"); break;
			case 13: System.out.print("King");
                         default: System.out.println("No RankHear.");
		}
		System.out.print(" of ");
		switch (suit) // Get suit
		{
			case "Clubs": System.out.println("Clubs"); break;
			case "Diamonds": System.out.println("Diamonds"); break;
			case "Hearts": System.out.println("Hearts"); break;
			case "Spades": System.out.println("Spades"); 
                         default: System.out.println("No suit."); 
		}
        //Then report the result here
    }
    
}
