package com.go2it.edu.lecture7.RuntimeException;

import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws CustomException {
        throw new CustomException("Load fail ", new FileNotFoundException(), 1);

    }

    public ExceptionTest() {

    }

    ExceptionTest name = new ExceptionTest();

//    public void countInstance() {
//        for (ExceptionTest exception : name) {
//            new ExceptionTest();
//            System.out.println("Count is " + new ExceptionTest());
//        }
//
//    }

}


