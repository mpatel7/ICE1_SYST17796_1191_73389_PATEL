/*
 Modified by : Suban Shrestha
Student ID : 991527799
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.HashSet;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        
        Card[] magicHand = new Card[7];
        
       
                
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             
//c.setValue(insert call to random number generator here)
             c.setValue((int)(Math.random()*13 +1));
            
            c.setSuit(Card.SUITS[(int)(Math.random()*4 )]);
            
           
            magicHand[i] = c;
             System.out.println("value: "+magicHand[i].getValue()+ magicHand[i].getSuit());
        }
        
        Card userCard = new Card();
        
        System.out.print("Enter the card value ");
        int userValue = in.nextInt();
        
        
        userCard.setValue(userValue);
        
        
        System.out.print("Enter the suit value ");
        String userSuit = in.next();
         userCard.setSuit(userSuit);
         
         
         
           String result ="Cards did not matched";
             
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i].getSuit().equalsIgnoreCase(userSuit) && magicHand[i].getValue()==userValue){
           
                result = "Cards are matched ";
            
            break;
        
               
            }
             
        }
         System.out.println(result);
        
          
         
          
          
           
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    

