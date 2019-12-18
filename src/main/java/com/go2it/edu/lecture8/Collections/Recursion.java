package com.go2it.edu.lecture8.Collections;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(0, 4));
    }
    private static int sum(int currentSum, int numberOfElems){
        return sum(currentSum + numberOfElems, numberOfElems - 1);
 //       if(numberOfElems == 0)
 //           return currentSum;
        }
    }

