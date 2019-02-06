/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
//This Scanner class is used.
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 * Modifier - Humpreet Kaur
 * Student ID - 991516230
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Card c = new Card();
        for (int i=0; i<magicHand.length; i++)
        {
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 3) + 0]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scan = new Scanner(System.in);
        System.out.println("User's Card Value and Suit");
        Card user = new Card();
        for (int i=0; i<magicHand.length; i++)
        {
            user.setValue((int)(Math.random() * 13) + 1);
            user.setSuit(Card.SUITS[(int)(Math.random() * 3) + 0]);
        }
        System.out.println(user.getValue()+ ", " +user.getSuit());
        
        // and search magicHand here
        System.out.println("Randomly generated Card Value and Suit");
        System.out.println(c.getValue()+ ", " +c.getSuit());
        
        //Then report the result here
        if(c.getValue()== user.getValue() && c.getSuit().equals(user.getValue())) {
            System.out.println("Your cards are matched");
        }
        else {
            System.out.println("Your cards are not matched");
        }
    }
    
}
