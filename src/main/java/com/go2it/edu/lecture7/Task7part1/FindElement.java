package com.go2it.edu.lecture7.Task7part1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindElement {
    public static void main(String[] args) throws IOException {
        // Get the 99th element from the console args
        try {
            String consoleElement = args[98];
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(" The element was not found. It's out of bounds with index " + exception.getMessage());
        }

//Search for a letter “X” in a word “GoGoJava” and will make a substring based on
//the index of “X” till the end of the word
        try {
            String word = "GoGoJava";
            int indexOfX = word.indexOf("X");
            word.substring(indexOfX, word.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The letter was not found");
        }

        // FINALLY BLOCK (HANDLE 2)
        int i = 6;
        try {
            if (i % 2 == 0) {
                throw new IOException(" This is test exception");
            } else {
            }
        } catch (RuntimeException e) {
            System.out.println("Woohoo! I've caught RuntimeException" + e.getMessage());
        } finally {
            System.out.println("This code will be executed always! ");
        }

//Create an object of a BufferedReaded class and pass another object of
//FileReaderClass with parameter in constructor “Dog.class”
//new BufferedReader(new FileReader("Car.java"))

        FileReader fileReader = new FileReader("Dog.class");
        BufferedReader object = new BufferedReader(new FileReader("Car.java"));

    }
}


