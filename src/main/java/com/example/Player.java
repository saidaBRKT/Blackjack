package com.example;

import java.util.Scanner;

public class Player extends Person{

    public Player(){
        super.setName("Player");
    }

    public void makeDecision(Deck deck) {

        int  d = 0;
        Scanner input=new Scanner(System.in);
        System.out.println("\nWould you like to:\n\t 1) Hit \n\t 2) Stand");
        d = input.nextInt();

        if (d == 1) {
            this.hit(deck);
            if(this.getHand().calculatedValue()>20){
                return;
            }
            else{
                this.makeDecision(deck);
            }
        } else {
            System.out.println("You stand.");
        }
    }

}
