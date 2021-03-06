package com.go2it.edu.lecture3.methods;
// Create a method that will sum two arguments passed in and will return the result

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Calculator {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        MathematicalOperations operation = MathematicalOperations.valueOf(args[2]); // declare variable 'Operation' from class enum and program arguments

        add(x, y);
        divide(x, y);
        calculate(x, y, operation);
        //          calculate(x,y, MathematicalOperations.MULTIPLICATION);
        //     this for using enum class
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static void divide(int x, int y) {
        int result = x / y;
        System.out.println("The result of division is: " + result);
    }

//    Task 3.4    Create a calculator:
// Two digits and mathematical operation (enum) are passed in
// Corresponding operation is performed for arguments
// Method prints the operation and the result
// Examples:
// 33, 3, “DIVISION” are passed in, method must print “The result of division is 11”
// 27, 23, “SUBTRACTION” are passed in, method must print “The result of subtraction is 4”

    private enum MathematicalOperations {
        DIVISION, MULTIPLICATION, ADDITION, SUBSTRACTION;
    }

    public static double calculate(int x, int y, MathematicalOperations operation) {
        double result;
        switch (operation) {
            case DIVISION: {
                result = x / y;
                String output = "The result of division is: " + result;
                System.out.println(output);
                break;
            }
            case MULTIPLICATION: {
                result = x * y;
                String output = "The result of multiplication is: " + result;
                System.out.println(output);
                break;
            }
            case ADDITION: {
                result = x + y;
                String output = "The result of addition is: " + result;
                System.out.println(output);
                break;
            }
            case SUBSTRACTION: {
                result = x - y;
                String output = "The result of addition is: " + result;
                System.out.println(output);
                break;
            }
            default:
                result = 0;
        }
        return result;
    }

}

