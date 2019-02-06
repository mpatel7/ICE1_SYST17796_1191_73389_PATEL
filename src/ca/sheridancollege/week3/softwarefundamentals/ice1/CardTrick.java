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
 * modifier Simarjeet Kaur Id 991513366
 some changes here.
 * final commit is done.
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int randomNumber = (int)(Math.random()*7);
            int randNum = (int)(Math.random()*3);
            c.setValue(randomNumber);
            c.setSuit(Card.SUITS[randNum]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the value for card values and suits");
         int cardValue = input.nextInt();
         int suit  = input.nextInt();
       
         Card user = new Card();
         if(user==c){
             System.out.println("you are lucky");
         }
         else{
             System.out.println("Sorry try next time");
         }
         
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    }
}

