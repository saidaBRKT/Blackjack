package com.example;
import java.util.*;

public class Hand {

    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }
    
    public void handTakeCard(Deck deck){
        hand.add(deck.takeCard());
    }

    public int calculatedValue(){
        int value = 0;
        int c=0;
        for(Card card: hand) {
            value += card.getValue();
            if(card.getValue()==1){
                c=c+1;
            }
        }
        if(value-c<=10 && c>0)
        return value+=10;
        else 
        return value;
    }
  
    public Card getCard(int id){
        return hand.get(id);
    }

}

