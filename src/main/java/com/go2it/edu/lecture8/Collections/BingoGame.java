package com.go2it.edu.lecture8.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoGame {
    public static void main(java.lang.String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            lottery.add(i);// will add numbers from 1 to 100 in lottery
        }

        Collections.shuffle(lottery);// this method can mix the value of lottery
        System.out.println("The first 10 numbers: ");
        List<Integer> lot = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer currentLotNumber = lottery.get(i);
            System.out.println(currentLotNumber); // will get only first 10 integers
            lot.add(currentLotNumber);
        }
        int maxValue = 0;
        int minValue = 100;
        for (Integer currentLotNumber : lot) {
            if (currentLotNumber > maxValue) {
                maxValue = currentLotNumber;
            }
            if (currentLotNumber < minValue) {
                minValue = currentLotNumber;
            }
        }
        System.out.println("The maximum number is: " + maxValue);
        System.out.println("The minimum number is: " + minValue);

        //       System.out.println("The minimum number is: " + Collections.min(lottery));

    }

}

