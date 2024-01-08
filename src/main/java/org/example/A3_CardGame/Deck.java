package org.example.A3_CardGame;

import java.util.ArrayList;

public class Deck {
    
    ArrayList<Card> cards = new ArrayList<>();
    Deck(){
        // Shades

        cards.add(new Card(1, "Shades"));
        cards.add(new Card(2, "Shades"));
        cards.add(new Card(3, "Shades"));
        cards.add(new Card(4, "Shades"));
        cards.add(new Card(5, "Shades"));
        cards.add(new Card(6, "Shades"));
        cards.add(new Card(7, "Shades"));
        cards.add(new Card(8, "Shades"));
        cards.add(new Card(9, "Shades"));
        cards.add(new Card(10, "Shades"));
        cards.add(new Card(11, "Shades"));
        cards.add(new Card(12, "Shades"));
        cards.add(new Card(13, "Shades"));

        // Diamonds
        cards.add(new Card(1, "Diamonds"));
        cards.add(new Card(2, "Diamonds"));
        cards.add(new Card(3, "Diamonds"));
        cards.add(new Card(4, "Diamonds"));
        cards.add(new Card(5, "Diamonds"));
        cards.add(new Card(6, "Diamonds"));
        cards.add(new Card(7, "Diamonds"));
        cards.add(new Card(8, "Diamonds"));
        cards.add(new Card(9, "Diamonds"));
        cards.add(new Card(10, "Diamonds"));
        cards.add(new Card(11, "Diamonds"));
        cards.add(new Card(12, "Diamonds"));
        cards.add(new Card(13, "Diamonds"));

        // Hearts
        cards.add(new Card(1, "Hearts"));
        cards.add(new Card(2, "Hearts"));
        cards.add(new Card(3, "Hearts"));
        cards.add(new Card(4, "Hearts"));
        cards.add(new Card(5, "Hearts"));
        cards.add(new Card(6, "Hearts"));
        cards.add(new Card(7, "Hearts"));
        cards.add(new Card(8, "Hearts"));
        cards.add(new Card(9, "Hearts"));
        cards.add(new Card(10, "Hearts"));
        cards.add(new Card(11, "Hearts"));
        cards.add(new Card(12, "Hearts"));
        cards.add(new Card(13, "Hearts"));

        // Clubs
        cards.add(new Card(1, "Clubs"));
        cards.add(new Card(2, "Clubs"));
        cards.add(new Card(3, "Clubs"));
        cards.add(new Card(4, "Clubs"));
        cards.add(new Card(5, "Clubs"));
        cards.add(new Card(6, "Clubs"));
        cards.add(new Card(7, "Clubs"));
        cards.add(new Card(8, "Clubs"));
        cards.add(new Card(9, "Clubs"));
        cards.add(new Card(10, "Clubs"));
        cards.add(new Card(11, "Clubs"));
        cards.add(new Card(12, "Clubs"));
        cards.add(new Card(13, "Clubs"));
    }

    public void addCard(){

    }
    public void removeCard(int removeIndex){
        cards.remove(removeIndex);
    }

    public void displayCards(){
        System.out.println("Cards- " );
        for (Card card: cards) {
            System.out.println(card);
        }
    }

}
