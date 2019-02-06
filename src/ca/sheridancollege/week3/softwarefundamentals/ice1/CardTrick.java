/*
*991533578
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
           magicHand[i]=new card();
           magicHand[i].setValue((int)(Math.random() *13  +1));
           
            
        
        
        
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scan =new Scanner(System.in);
        System.out.println("enter card value");
        int cvalue =scan.nextInt();
        System.out.println("enter suit ");
        String suit=scan.nextLine();
     
        
        // and search magicHand here
        //Then report the result here
    }
    
}
