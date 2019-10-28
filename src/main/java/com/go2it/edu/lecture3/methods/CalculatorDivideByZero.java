package com.go2it.edu.lecture3.methods;
//    Task 3.4    Create a calculator:
// Two digits and mathematical operation (enum) are passed in
// Corresponding operation is performed for arguments
// Method prints the operation and the result
// Examples:
// 33, 6,  “DIVISION” are passed in, method must print “The result of division is 11”
// 27, 23, “SUBTRACTION” are passed in, method must print “The result of subtraction is 4”

//  а что будет если мы передадим в операцию деления два нуля в качестве аргументов?
//Этот сценарий (а точнее значение одного аргументам) лучше перехватить перед выполнением деления
// (посмотри как IllegalArgumentException можно throw)

public class CalculatorDivideByZero {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        MathematicalOperations operation = MathematicalOperations.valueOf(args[2]); // declare variable 'Operation' from class enum and program arguments
        calculate(x, y, operation);


        //          calculate(x,y, MathematicalOperations.MULTIPLICATION);
        //     this for using enum class
    }

    private enum MathematicalOperations {
        DIVISION, MULTIPLICATION, ADDITION, SUBSTRACTION;
    }

    public static void calculate(int x, int y, MathematicalOperations operation) {

        switch (operation) {
            case DIVISION: {
                if (x==0 && y==0)
                    throw new IllegalArgumentException("Digits should not be equal to zero ");
                System.out.println();
                int result = x / y;
                String output = "The result of division is: " + result;
                System.out.println(output);
                break;
            }
            case MULTIPLICATION: {
                int result = x * y;
                String output = "The result of multiplication is: " + result;
                System.out.println(output);
                break;
            }
            case ADDITION: {
                int result = x + y;
                String output = "The result of addition is: " + result;
                System.out.println(output);
                break;
            }
            case SUBSTRACTION: {
                int result = x - y;
                String output = "The result of addition is: " + result;
                System.out.println(output);
                break;
            }
            default:

        }

    }

}

