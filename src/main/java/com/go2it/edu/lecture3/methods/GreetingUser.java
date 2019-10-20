package com.go2it.edu.lecture3.methods;

public class GreetingUser {
    public static void main(String[] args) {
        String userName = args[0];
        printGreeting(createGreeting(args[0]));
    }

    public static String createGreeting(String userName) {
        return "Hello, " + userName;
    }

    public static void printGreeting(String greeting){ ;
                System.out.println(greeting);
    }

}


