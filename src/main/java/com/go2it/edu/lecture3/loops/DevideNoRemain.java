package com.go2it.edu.lecture3.loops;



//Create an array of 100 int; put only even values inside; show all values; show only values that can be divided by 3 with no remain

public class DevideNoRemain {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for (int i = 0; i < array.length; i++) ;
//        System.out.println(array[i]); // show all values 


        // show only values that can be divided by 3 with no remain 
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
