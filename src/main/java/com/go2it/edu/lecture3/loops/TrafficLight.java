package com.go2it.edu.lecture3.loops;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        String userInput;
        try (Scanner in = new Scanner(System.in)) {
            userInput = in.nextLine();
            if (userInput.equals("green")){
                System.out.println("The traffic light is green. Soon it will change to yellow. Driver can proceed");
            }
            if (userInput.equals("red")){
                System.out.println("The traffic light is red. Driver should stop and wait for green light");
            }else{
                System.out.println(" Please enter another color");
            }
        }
    }
}
