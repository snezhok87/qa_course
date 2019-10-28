package com.go2it.edu.lecture3.methods;

import java.util.Scanner;

public class InstanseAndStaticMethods {
    public static void main(String[] args) {
        System.out.println("Before starting method was involved");

        String result = staticMethod(args);

        System.out.println(result);
        System.out.println("After starting method was involved");
        InstanseAndStaticMethods instance = new InstanseAndStaticMethods();
        instance.instanceMethod();
//        double pow = Math.pow(2, 3);
//        System.out.println(pow);
//
//        double one = myPow(1, 3);
//        System.out.println(one);
//        int res = sum(5, 4);
//        System.out.println(res);
    }

    public static double myPow(int x, int y) {
        return Math.pow(x, y);
    }

    public void instanceMethod() {
        System.out.println("Hello user! Please enter your name: ");
        Scanner in = new Scanner(System.in);
        String inputFromUser = in.nextLine();
        System.out.println("Welcom, " + inputFromUser);
    }

    public static String staticMethod(String[] names) {
        String[] users = {"John", "Maria", "Alan"};
        String greeting = "Hello,my friend " + users[0] + " and " + names[0];
        System.out.println("Inside static method ");
        return greeting;
    }

//    public static int sum(int a, int b){
//        return a + b;
//    }
}
