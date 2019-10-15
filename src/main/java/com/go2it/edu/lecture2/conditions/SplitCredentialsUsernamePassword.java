package com.go2it.edu.lecture2.conditions;
// Task 2.3.           Alex|qwertY1

public class SplitCredentialsUsernamePassword {
        public static void main(String[] args) {
        String username = "Alex";
        String password = "qwertY1";
        String userInput;

        if (username.indexOf(args[0]) {
            username = args[0].substring(0, 5);
        }
        if (password.indexOf(args[0]) {
                password = args[0].substring(5, 12);
                userInput = in.nextLine();
                System.out.println("Welcome, " + userInput);
        } else {
            System.out.println("Incorrect username or password. ");
        }
    }
}
