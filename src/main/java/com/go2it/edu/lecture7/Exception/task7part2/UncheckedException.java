package com.go2it.edu.lecture7.Exception.task7part2;
// Common unchecked exceptions in the java.lang package (RUNTIME):
//ArithmeticException
//IndexOutOfBoundsException
//ArrayIndexOutOfBoundsException
//StringIndexOutOfBoundsException
//ArrayStoreException
//ClassCastException
//EnumConstantNotPresentException
//IllegalArgumentException
//IllegalThreadStateException
//NumberFormatException
//IllegalMonitorStateException
//IllegalStateException
//NegativeArraySizeException
//NullPointerException
//SecurityException
//TypeNotPresentException
//UnsupportedOperationException

public class UncheckedException {
    public static void main(String[] args) {
        String names[] = {"Snezhana", "Julia", "Alex"}; // name has only 3 elements.
        System.out.println(names[4]); // trying to display the value of 4th element

        calculate(15, 0);
        currentAge(15);
    }

    public static void calculate(int number1, int number2) {
        int result = number1 / number2;   //ArithmeticException
        System.out.println(result);
    }

    public static void currentAge(int age) {
        if (age < 0 || age > 99) {
            System.out.println(age);
        }
    }

}
