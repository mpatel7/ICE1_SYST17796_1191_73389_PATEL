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
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        //Cretaed 2 new arrays in program.
        Card[] Number=new Card[13];
        Card[] Suit=new Card[4];
       int suit;
       
       Scanner input=new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Number[i]=(int)c.setValue(Math.random()*13+1);
            Suit[i]=c.getSuit(Math.random()*SUITS.length);
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.println("Input your card no.");
        int card_Value = input.nextInt() ;
        System.out.println("Input your card value");
        String card_Suit = input.next();
        
        if(Arrays.asList(Number).contains(card_Value))
        {
            if(Arrays.asList(Suit).contains(card_Suit))
            {
                System.out.println("You have same exactly card");
            }
            else
            {
                System.out.println("Your card have same no.");
            }
        }
        if else(Arrays.asList(Suit).contains(card_Suit))
                {
                    if(Arrays.asList(Number).contains(card_Value))
                    {
                        System.out.println("You have same exactly card");
                    }
                    else
                    {
                         System.out.println("Your card have same no.");
                    }
                }
        else
                {
                        System.out.println("You do not have same card");
                }
                        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
