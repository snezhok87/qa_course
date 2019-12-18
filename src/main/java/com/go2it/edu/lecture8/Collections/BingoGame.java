package com.go2it.edu.lecture8.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BingoGame {
    public static void main(java.lang.String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            lottery.add(i);// will add numbers from 1 to 100 in lottery
        }

        Collections.shuffle(lottery);// this method can mix the value of lottery
        System.out.println("The first 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i)); // will get only first 10 integers
        }

        // will get the MAX or MIN numbers
        System.out.println("The maximum number is: " + Collections.max(lottery));
        System.out.println("The minimum number is: " + Collections.min(lottery));

    }

}

