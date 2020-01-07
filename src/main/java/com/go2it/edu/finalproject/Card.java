package com.go2it.edu.finalproject;

public class Card {
    private Suit suit;
    private Rank rank;

    public enum Suit {
        DIAMOND, CLUB, HEART, SPADE
    }

    // kinds of ranks
    public enum Rank {
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        public final int value;

        Rank(int value) {
            this.value = value;
        }
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "{" + rank + " " + suit + '}';
    }
}


