package com.go2it.edu.lecture1;

public class Lecture1Task2 {
    public static void main(String[] args) {
        int number1= Integer.parseInt(args[0]);
        int number2= Integer.parseInt(args[1]);
        int number3= Integer.parseInt(args[2]);
        int number4= Integer.parseInt(args[3]);
        int sum=number1+number2+number3+number4;
        System.out.println("The result of "+ args[0] + "+" + args[1]+ "+" + args[2] + "+"  + args[3] + " is " + sum);

    }
}
