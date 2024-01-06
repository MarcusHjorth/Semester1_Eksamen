package org.example.A3_CardGame;

public class Card {
    private int rank;
    private String suit;

    Card(int rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card - " + rank + " of " + suit ;
    }
}
