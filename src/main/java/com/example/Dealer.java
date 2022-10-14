package com.example;

public class Dealer extends Person{

    public Dealer(){
        super.setName("Dealer");
    } 
     
    public void firstCard(){
        System.out.println("Dealer's first card :"+super.getHand().getCard(0));
    }

}
