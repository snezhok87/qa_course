package com.go2it.edu.finalproject;

public class DurakGame {
    final static int CARDS_PER_PLAYER = 6;

    public static void main(String[] args) {

        //1. Create and shuffle a deck
        Deck deck = new Deck();
        //  give a card for each player
        Player[] players = {
                new Player("Vasya"),
                new Player("Dan"),
                new Player("Kate"),
                new Player("Sveta")
        };
        dealInitialCards(deck, players);

        for (Player player : players) {
            System.out.println(player.getName() + " has " + player.getCards().size() + " cards: " + player.getCards());
        }

        int attackIndex = 0;
        int defendIndex = 1;

        Player attackingPlayer;
        Player defendingPlayer;

        do {
            attackingPlayer = players[attackIndex];
            defendingPlayer = players[defendIndex];
            Card attackingCard = attackingPlayer.dropCardFromHand();
            System.out.println(attackingPlayer + " goes with card " + attackingCard);

            boolean isCardBeaten = defendingPlayer.defend(attackingCard);

            if (isCardBeaten) {
                attackIndex++; // index of player will increase
                defendIndex++;
            } else {
                attackIndex = attackIndex + 2;
                defendIndex = defendIndex + 2;
            }
            if (defendIndex == 4) {
                defendIndex = 0;
            }
            if (attackIndex == 5) {
                attackIndex = 1;
            }
            if (attackIndex == 4) {
                attackIndex = 0;
            }
            if (defendIndex == 5) {
                defendIndex = 1;
            }

            System.out.println();
        } while (!attackingPlayer.getCards().isEmpty() && !defendingPlayer.getCards().isEmpty());

        if (attackingPlayer.getCards().isEmpty() || defendingPlayer.getCards().isEmpty()) {
            System.out.println("The winner is " + attackingPlayer );
        }
    }

    private static void dealInitialCards(Deck deck, Player[] players) {
        for (int i = 1; i <= CARDS_PER_PLAYER; i++) {
            // using for-each loop I will get each player
            for (Player player : players) {
                //2. Take a card from the top
                Card card = deck.takeFromTop();
                //3. Give the card to a player
                player.addCardToHand(card);
            }
        }
    }
}
