package com.go2it.edu.lecture2.arrays;

public class RefactorLoginSystem {
    public static void main(String[] args) {
//        enter in arguments   (visa versa)         username=Alex  or  password=xXx
        String username = "";
        String password = "";
        //system checks what is the first argument passed- username or password
        if (args[0].contains("username") && args[1].contains("password")) {
             username = args[0].substring(9);
             password = args[1].substring(9);
        }
        if (args[0].contains("password") && args[1].contains("username")) {
             password = args[0].substring(9);
             username = args[1].substring(9);
        }
       // System.out.println(username);
       // System.out.println(password);
        if (username.equals("xXx") && password.equals("Alex")) {
            System.out.println("Login successful. ");
        } else {
            System.out.println("Login failed. ");
        }
    }
}



