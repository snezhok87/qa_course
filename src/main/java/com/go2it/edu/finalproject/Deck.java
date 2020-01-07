package com.go2it.edu.finalproject;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>(36);
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Rank r : Card.Rank.values()) {
                cards.add(new Card(s, r));
            }
        }

        Collections.shuffle(cards);
        System.out.println("The cards were shuffled");
    }

    // method takeFromTop
    // remove the value with index 0 and return card
    public Card takeFromTop() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.size()==0;
    }
}
