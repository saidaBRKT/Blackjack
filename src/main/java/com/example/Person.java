package com.example;

public class Person {

   
    private Hand hand;
    private String name;
    
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public Person() {
        this.hand = new Hand();
        this.name = "";
    }

    public boolean hasBlackjack(){
        if(this.getHand().calculatedValue() == 21)
            return true;
        else return false;
    }

    public void totalHand(){
        System.out.println(this.name + " Total : " + this.hand.calculatedValue());
    }

    public void hit(Deck deck){
        this.hand.handTakeCard(deck);
        this.totalHand();
    }

    
}
