package com.go2it.edu.lecture7.Exception.practice;

import java.util.Arrays;
import java.util.List;

public class Print {
    void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        Print print = new Print();
        List list= Arrays.asList("first step", null, "second step");

//        for (String s :list) {
//            try {
//                print.print(s);
//            }
//            catch (NullPointerException e) {
//                System.out.println(e.getMessage());
//                System.out.println("Exception was processed. Program continues");
//            }
//            finally {
//                System.out.println("Inside bloсk finally");
//            }
//            System.out.println("Go program....");
//            System.out.println("-----------------");
//        }
//
//    }
//
//    public String input() {
//        String s = null;
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            s = reader.readLine();
//            if (s.equals("")) {
//                throw new MyException("String can not be empty!");
//            }
//        } catch (IOException | MyException e) {
//            System.out.println(e.getMessage());
//        }
//        return s;
   }
}

