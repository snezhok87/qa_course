package com.go2it.edu.lecture3.methods;

import java.util.Scanner;

public class InstanseAndStaticMethods {
    public static void main(String[] args) {
        System.out.println("Before starting method was involved");
        String result = staticMethod(args);
        System.out.println(staticMethod(args));
        System.out.println("After starting method was involved");
        InstanseAndStaticMethods instanceMethod = new InstanseAndStaticMethods();
        instanceMethod.instanceMethod();
    }

    public void instanceMethod(){
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
}
