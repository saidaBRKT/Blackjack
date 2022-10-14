package com.example;

public class Game {

    private Deck deck;
    private Dealer dealer;
    private Player player;

    public Game() {
        this.deck = new Deck();
        this.dealer = new Dealer();
        this.player = new Player();

        deck.shffleDeck();
        start();
    }

    private void start(){

        dealer.getHand().handTakeCard(deck);
        dealer.getHand().handTakeCard(deck);

        player.getHand().handTakeCard(deck);
        player.getHand().handTakeCard(deck);

        dealer.firstCard();
        player.totalHand();

        if(dealer.hasBlackjack()){
            dealer.totalHand();
            if(player.hasBlackjack()){
                System.out.println("You both have BlackJack.");
            }
            else{
                System.out.println("Dealer has BlackJack.");
                dealer.totalHand();
            }
        }
        if(player.hasBlackjack()){
            System.out.println("Player have Blackjack.");
        }

        player.makeDecision(deck);

        if(player.getHand().calculatedValue() > 21){
            System.out.println("Player busts");
            System.out.println("\t\t============== Result ==============\n");
            System.out.println("\t\t\tDealer win");
            System.out.println("\n\t\t====================================");
            return;
        }

        dealer.totalHand();
        while(dealer.getHand().calculatedValue()<17){
            dealer.hit(deck);
        }
    
        if(dealer.getHand().calculatedValue()>21){
            System.out.println("Dealer busts");
            System.out.println("\t\t============== Result ==============\n");
            System.out.println("\t\t\tPlayer win.");
            System.out.println("\n\t\t====================================");
        }
        
        if(dealer.getHand().calculatedValue()<=21){
            System.out.println("\t\t============== Result ==============\n");

            if(dealer.getHand().calculatedValue() > player.getHand().calculatedValue())
                System.out.println("\t\t\tDealer win.");
            
            else if(player.getHand().calculatedValue() > dealer.getHand().calculatedValue())
                System.out.println("\t\t\tPlayer win.");

            else System.out.println("\t\t\tPush.");
            System.out.println("\n\t\t====================================");
       }
   }  

}
