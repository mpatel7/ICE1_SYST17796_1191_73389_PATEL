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
 * modifier Munmun Nandi
 * Student id 991103144
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int ranNum=(int)(Math.random()*7 +1);
            int ranNum1=(int)(Math.random()*3 );
            c.setValue(ranNum);
            c.setSuit(Card.SUITS[ranNum1]);
            
            Scanner input=new Scanner(System.in);
            System.out.println("Please Enter the card value and suit");
            int x=input.nextInt();
            Card user=new Card();
            if(user==c){
                System.out.println("Magic hand is found");
            }
            else{System.out.println("sorry play again");
            
            }
            
            //cbjhjh.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
