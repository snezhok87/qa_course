package com.go2it.edu.lecture3.methods;
// Task lecture 3
//Refactor “Create an array of 100 int” task:
// create a method showElemsDividablyBy(int i) that will accept a number we
//want to divide each element on. This method will return nothing (void) and will
//show all the elements meeting this condition

import java.util.Arrays;

public class CorrespondingMethod {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int[] oddValues = initializedArray();
        showAllElements(oddValues); // call methods and (pass oddValue)
        showElemsDividablyBy(number, oddValues);
    }
    //create a method initializeArray that will create an array, will put only (!) odd values inside
    // and will return the resulting array (returns int[])

    public static int[] initializedArray() {
        int[] oddValues = new int[100];
        for (int i = 0; i < oddValues.length; i++) {
            oddValues[i] = 2 * i + 1;
        }
        return oddValues;
    }
    //create a method showAllElements that will show all the elements present in the array. This method will return nothing (void)

    public static void showAllElements(int[] values) {
        System.out.println(Arrays.toString(values));
    }

    // create a method showElemsDividablyBy(int i) that will accept a number we want to divide each element on.
    // This method will return nothing (void) and will show all the elements meeting this condition

    public static void showElemsDividablyBy(int x, int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % x == 0) {
                System.out.println(values[i]);
            }
        }
    }
}












