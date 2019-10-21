package com.go2it.edu.lecture3.methods;
// Create a method that will sum two arguments passed in and will return the result

public class Calculator {
    public static void main(String[] args) {
    add();
    devide();
    }
        public static int add() {
            int i = 56;
            int a = 35;
            int result = Integer.sum(i, a);
 //           System.out.println("The sum of numbers is: " + result);
            return result;
        }
        public static void devide(){
            int i = 60;
            int a = 10;
            int result = i/a;
            System.out.println("The result od division is: " + result);
        }

//        Create a calculator:
// Two digits and mathematical operation (enum) are passed in
// Corresponding operation is performed for arguments
// Method prints the operation and the result
// Examples:
// 33, 3, “DIVISION” are passed in, method must print “The result of division is 11”
// 27, 23, “SUBTRACTION” are passed in, method must print “The result of subtraction is 4”



}

