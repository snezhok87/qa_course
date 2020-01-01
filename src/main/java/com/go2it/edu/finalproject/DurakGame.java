package com.go2it.edu.finalproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DurakGame {
    public static void main(String[] args) {
        int cardsPerPlayer = 6;
        int players = 4 ;

        String[] suits = {"Пик", "Бубен", "Черв", "Треф"};

        String[] rank = {"6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int n = suits.length * rank.length; // количество карт в колоде (36)

        ArrayList<Integer> cardGame = new ArrayList<>(36);
        for (int i = 1; i <= 36; i++) {
            cardGame.add(i);// will add cards from 1 to 36
        }

        Collections.shuffle(cardGame);
        System.out.println("The cards were shuffled");
    }

}
