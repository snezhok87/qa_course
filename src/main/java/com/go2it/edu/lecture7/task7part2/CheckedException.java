package com.go2it.edu.lecture7.task7part2;
// Checked Exceptions –

//SQLException
//IOException
//ClassNotFoundException
//InvocationTargetException

public class CheckedException {
    public static void main(String[] args) {
        int age = 105;
        try {
            String names[] = {"Snezhana", "Julia", "Alex"}; // name has only 3 elements.
            System.out.println(names[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index does not exist. Please correct the error. ");
        }

        try {
            int number1 = 10;
            int number2 = 0;
            int result = number1 / number2;   //ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("The integer cannot be divided by Zero ");
        }

        try {
            if (!(age <= 99)) {
                System.out.println("Age");
                throw new Exception("The type of value is incorrect ");
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

}
