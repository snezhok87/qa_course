package com.go2it.edu.lecture2.conditions;

public class IntVar {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        if (a > b) {
            System.out.println("The first variable is bigger than the second one. Values are: " + a + ", " + b);
        }
        if (b > a) {
            System.out.println("It is weird, but the second variable is bigger.");
        }
        if (b == a) {
            System.out.println("Both variables have the same value: " + a);
        }
    }
}


