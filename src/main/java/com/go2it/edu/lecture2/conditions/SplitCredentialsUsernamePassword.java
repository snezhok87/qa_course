package com.go2it.edu.lecture2.conditions;
// Task 2.3.           Alex|qwertY1
//                     0123

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class SplitCredentialsUsernamePassword {
    public static void main(String[] args) {
        String credentials = args[0] + "|" + args[1];
        String correctUsername = "Alex";
        String correctPassword = "qwertY1";
        int usernameIndex = credentials.indexOf(correctUsername);
        int passwordIndex = credentials.indexOf(correctPassword);
        int pipeIndex = credentials.indexOf("|");
//        System.out.println(usernameIndex);
//        System.out.println(passwordIndex);
//        System.out.println(pipeIndex);

        String username = credentials.substring(usernameIndex, pipeIndex);
        String password = credentials.substring(passwordIndex);

//        System.out.println(username);
//        System.out.println(password);

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
           System.out.println("Welcome, " + username);
       } else {
            System.out.println("Incorrect username/password ");
        }

    }
}
