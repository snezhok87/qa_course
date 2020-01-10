package com.go2it.edu.finalproject;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>(); // create the empty list of Card
    }

    public void addCardToHand(Card card) {
        cards.add(card);
    }

    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return this.cards;
    }

    // player goes with one card to other player
    public Card dropCardFromHand() {
        Card attackingCard = cards.remove(0); //  get first item from List<Card> and remove
        return attackingCard;
    }

    // other player defends, or takes card
    public boolean defend(Card attackingCard) {
//        boolean cardFound = false;
        for (int i = 0; i < cards.size(); i++) {
            Card defendingCard = cards.get(i);
            // compare attacking card and defending card
            if (attackingCard.getSuit() == defendingCard.getSuit() && defendingCard.getRank().value > attackingCard.getRank().value) {
//                cardFound = true;
                System.out.println(name + " beats " + attackingCard + " with " + defendingCard);
                cards.remove(i); //defending player remove defending card
                return true;
//                break;
            }
        }
//        if (!cardFound) {
        cards.add(attackingCard); // attackingCard add to List<Card> of defending player
        System.out.println(name + " cannot find a card to beat, so they take the card " + attackingCard);
        return false;
//        }
//        return cardFound;
    }

    @Override
    public String toString() {
        return name;
    }
}

