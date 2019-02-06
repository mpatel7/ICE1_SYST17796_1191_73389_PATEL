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
 * JASKARAN SINGH
 * 991525378
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
     
        
        
        for (int i=0; i<magicHand.length; i++)
        {
          magicHand[i] = new Card();
            magicHand[i].setValue((int)(Math.random() * 13 +1));
          //  magicHand[i].setSuit(Card.SUITS(Math.random() * 3));
            System.out.printf(magicHand[i].getSuit());
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 +1));
           //System.out.printf(magicHand.getSuit());
            
            //magicHand[i] = pick1 ;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
         int pick2 =  (int) (Math.random() * 13) +1 ;
        System.out.println("The magical number is "+pick2);
        
      //  if(pick == pick2){
            System.out.println("Congratulations !! You Won");
       // }else{
            System.out.println("Try Again");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    

