/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * 
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 * @modifier Julia991541164
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i]= new Card();
            magicHand[i].setValue((int)Math.random() * 13 + 1);
            magicHand[i].setSuit(Card.SUITS[(int)Math.random() * 3]);
            //magicHand[i].setSuit(Card.SUITS[3]);
        }
        
	    /* Replace with hardcoded luckyCard
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a card value (1-13): ");
        int userCardValue = sc.nextInt();
        System.out.println("Enter a suit (Hearts, Diamonds, Spades, or Clubs: ");
        sc.next();
        String userSuit = sc.nextLine();
        // and search magicHand here
        Boolean withinHand = false;
	for(Card cardA : magicHand) {
            if(cardA.getSuit().equalsIgnoreCase(userSuit)){
                if(cardA.getValue() == userCardValue){
                    withinHand = true;
                    break;
                }
            }
            }*/
	    
	    Card luckyCard = new Card();
	    luckyCard.setValue(12);
	    luckyCard.setSuit("Diamonds");
	    
	    System.out.println("Lucky card's suit: " + luckyCard.getSuit() + "\nLucky card's value: " + luckyCard.getValue());
	
        // and search magicHand here
        Boolean withinHand = false;
	for(Card cardA : magicHand) {
            if(cardA.getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                if(cardA.getValue() == luckyCard.getValue()){
                    withinHand = true;
                    break;
                }
            }
            } 
	
        //Then report the result here
        if(withinHand){
            System.out.println("The card is in the hand!");
        } else System.out.println("The card is not in the hand.");
    }
    
}
