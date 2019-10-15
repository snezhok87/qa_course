package com.go2it.edu.lecture2.conditions;

public class DoubleVariables {
    public static void main(String[] args) {
        double number1, number2;
        number1 = 20.5;
        number2 = 50.5;

        if (number1 > number2) {
            System.out.println("The first variable is bigger than the second one. Values are: " + number1 + ", " + number2);
        }
        if (number1 > number2) {
            System.out.println("It is weird, but the second variable is bigger.");
        }
        if (number1 == number2) {
            System.out.println("Both variables have the same value: " + number1);
        }
    }
}
