package com.go2it.edu.lecture7.customexception;

public class CustomExceptionTest {
    private static int numberOfObjectCreated;

    public CustomExceptionTest() throws MyException { // declare constructor
        numberOfObjectCreated++; // count the numberOfObjectCreated
 //       System.out.println("numberOfObjectCreated = " + numberOfObjectCreated );
        if (numberOfObjectCreated % 2 == 0) {
            throw new MyException("Test exception happened", new Throwable(), 404);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println("Creating new object " + (i + 1));
            try {
                CustomExceptionTest exceptionTest = new CustomExceptionTest(); // instance of CustomExceptionTest
            } catch (MyException e) {
                System.out.println("This is my custom exception:" + e.getMessage());
            }
        }
    }


}
