package com.go2it.edu.lecture3.loops;

import java.util.Scanner;

// Task: use Scanner class to read from console and show all user text until user input "quit" try
// Hint  (Scanner in=new Scanner (System.in)){
//       String inputString=in.nextLine();

public class ScannerUser {
    public static void main(String[] args) {
        String userInput;
        try (Scanner in = new Scanner(System.in)) {
            do {
                userInput = in.nextLine();
                System.out.println(userInput);
            } while (!userInput.equals("quit"));
        }
    }
}