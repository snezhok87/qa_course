package com.go2it.edu.lecture3.methods;
// Task: create a method initializeArray that will create an array, will put only (!) odd
// values inside and will return the resulting array (returns int[])

public class CorrespondingMethod {
    public static void main(String[] args) {
//        int[] oddValues;
        initializedArray();
    }

    public static int[] initializedArray() {
        int[] oddValues = new int[100];

        for (int i = 0; i < oddValues.length; i++) {
            oddValues[i] = i;
            System.out.println(oddValues[i]);
        }
        return oddValues;
    }
}










