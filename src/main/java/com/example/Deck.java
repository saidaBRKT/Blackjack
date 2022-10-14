package com.example;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;


public class Deck {
    
    private ArrayList<Card> deck;
    private ArrayList<Card> l1;
    private ArrayList<Card> l2;

    public Deck(){
        deck = new ArrayList<Card>();
        for(Suit s:Suit.values()){
            for(Rank r:Rank.values()){
                deck.add(new Card(r,s));
            }
        }
    }

    public void addCard(Card c){
        deck.add(c);
    }

    public void shffleDeck(){
        Collections.shuffle(deck);
    }

    public void piocher(ArrayList<Card> l,int n){
        l1 = new ArrayList<Card>();
        l2 = new ArrayList<Card>();
        for(int i=0;i<l.size();i++){
            if(i<=n) l1.add(l.get(i));
            else l2.add(l.get(i));
        }
        String res1="(";
        for(Card c:l1){
            res1+=c;
        }
        res1+=")";
        String res2="(";
        for(Card c:l2){
            res2+=c;
        }
        res2+=")";
        System.out.println(res1+""+res2);
    }
    
    public void defausser(ArrayList<Card> l1,ArrayList<Card> l2){
        ArrayList<Card> l;
        l=new ArrayList<>();
            for(int j=0;j<l1.size();j++){
               l.add(l1.get(j));
            }
            for(int i=0;i<l2.size();i++){
                l.add(l2.get(i));
             }
             String res="";
             for(Card c:l){
                 res+=c;
                }
                System.out.print(res);   
            }
    
    public String toString(){
        String res=" ";
        for(Card c:deck){
            res+=c;
        }
        return res;
    }

    public Card takeCard(){
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }

    public void filtreCards(){

        Card c=new Card(Rank.ACE, Suit.DIAMOND);

        // int pos=deck.indexOf(c);
        // System.out.println(pos);

        deck.stream().filter(card->deck.indexOf(card)>deck.indexOf(c)).collect(Collectors.toList()).forEach(System.out::print);

        // long s=deck.stream().count();
        // int s=deck.indexOf(c);

        // System.out.println(deck);
        // System.out.println(c);
        // System.out.println(deck.get(13));
    }

    















    // ArrayList<Card> arr = new ArrayList<Card>(); 
        
    // arr.add(new Card(Rank.ACE,Suit.DIAMOND)); 
    // arr.add(new Card(Rank.JACK,Suit.HEART)); 
    // arr.add(new Card(Rank.TEN,Suit.DIAMOND)); 
    // arr.add(new Card(Rank.ACE,Suit.CLUB));

    // Card ca =new Card(Rank.TEN,Suit.DIAMOND);

    // System.out.println(arr); 
    // System.out.println(arr.indexOf(ca));















    
        
        
}
