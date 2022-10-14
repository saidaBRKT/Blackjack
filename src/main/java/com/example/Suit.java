package com.example;

public enum Suit {
 
    CLUB("Clubs",1),
    DIAMOND("Diamonds",2),
    HEART("Hearts",3),
    SPADE("Spades",4);

    String suitName;
    int suitValue;
    Suit(String suitName,int suitValue){
      this.suitName=suitName;
      this.suitValue=suitValue;
    }
    public String toString(){
        return suitName;
    }

}
