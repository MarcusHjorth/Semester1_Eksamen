package org.example.A3_CardGame;

import java.util.Random;

public class Game {

    Deck deck  = new Deck();
    Game(){

    }

    public Card drawCard(){
        deck.displayCards();

        Random random = new Random();
        System.out.println();
        int randomIndex = random.nextInt(deck.cards.size());

        //deck.cards.remove(randomIndex);
        return deck.cards.get(randomIndex);
    }

    public Card highest(){
        Card nr1 = drawCard();
        Card nr2 = drawCard();

        System.out.println("First card: " + nr1);
        System.out.println("Second card: " + nr2);
        System.out.println();

        if (nr1.getRank() > nr2.getRank()){
            System.out.println("First card was the highest");
            return nr1;
        } else if (nr1.getSuitRank() > nr2.getSuitRank()) {
            System.out.println("Second card was the highest");
            return nr1;
        } else {
            System.out.println("Second card was the highest");
            return nr2;
        }
    }
}
