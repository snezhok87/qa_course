package com.go2it.edu.lecture7.Exception.exceptions;

import java.io.FileNotFoundException;

public class ExceptionExample {

    public static void main(String[] args) throws FileNotFoundException {// двнный exception не обрабатываем в catch block
        //      try{
        try {
            ClassToThrowException testClass = new ClassToThrowException("Test title");
            testClass.setTitle(null);

            System.out.println("It will not be executed");
        } catch (IllegalArgumentException |FileNotFoundException e) { // e название переменной, с кот. будем работать в середине
            System.out.println("oops! Exception was thrown: " + e.getMessage());
//            e.printStackTrace();
            e.getMessage();
            System.out.println(e.getMessage());
            // мы можем добавить surround try-catch
//            try {
//                throw e;
//            } catch (FileNotFoundException e1) {
//                e1.printStackTrace();
//        }
            // это наглядная иерархия
//        }catch (IOException e) {
//            System.out.println("Some log");
//        }catch (Exception e){
//            // exception logging

        }finally {
            System.out.println("This line will be always shown");
        }
//    }catch (Exception e){
//        System.out.println(Arrays.toString(e.getSuppressed()));
//      }
        System.out.println("After try-catch- finally");
    }
    }



