package org.example.A3_CardGame;

public class Card {
    private final int rank;
    private final String suit;
    
    private int suitRank;

    Card(int rank, String suit){
        this.rank = rank;
        this.suit = suit;
        switch (suit) {
            case "Clubs" -> suitRank = 1;
            case "Diamonds" -> suitRank = 2;
            case "Hearts" -> suitRank = 3;
            case "Shades" -> suitRank = 4;
        }
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getSuitRank(){
        return suitRank;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        switch (rank){
            case 1:
                builder.append("Card - Ace of " ).append(suit);
                break;
            case 11:
                builder.append("Card - Jack of " ).append(suit);
                break;
            case 12:
                builder.append("Card - Queen of " ).append(suit);
                break;
            case 13:
                builder.append("Card - King of " ).append(suit);
                break;
            default:
                builder.append("Card - ").append(rank).append(" of ").append(suit);
        }
        return builder.toString();
    }
}
