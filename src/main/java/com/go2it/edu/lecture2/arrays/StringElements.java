package com.go2it.edu.lecture2.arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringElements {
    public static void main(String[] args) {
       // String[] anArray = {"Jak ", "Paul ", "Neil ", "Koral ", "Petin "};
        // data type [1 array] = {"1 element"- 0 index, "2 element"-1 index, }
        //System.out.println(anArray[4]);


//        Boolean[] anArray;
//        anArray = new Boolean[10]; // allocates memory for 10 booleans
//        anArray[0] = false; // initialize first element and etc.
//        anArray[1] = true;
//        anArray[2] = true;
//        anArray[3] = false;
//        anArray[4] = false;
//        anArray[5] = false;
//        anArray[6] = true;
//        anArray[7] = false;
//        anArray[8] = true;
//        anArray[9] = false;
//        System.out.println(anArray[10]);

        //double[]anArray= new Double []{12.35}; why it does not work in this manner?

//        double[]anArray= new double[1];
//        anArray[0]= 123.25;
//        System.out.println(anArray[0]);

        //Lecture2 Task4 Arrays
        int[] intArray = new int[]{19,21,23,25,27,29,31};
        System.out.println(intArray[3]);
        System.out.println(intArray[5]);


        int[] intArray1 = new int[]{20,22,24,26,28,30,32,34,36,38};
        System.out.println(intArray1[6]);
                int length = intArray1.length;
        System.out.println("Integer array1 length is: " + intArray1.length);

    }
}


