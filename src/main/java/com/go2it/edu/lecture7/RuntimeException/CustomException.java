package com.go2it.edu.lecture7.RuntimeException;

public class CustomException extends Exception {
    private String name;
    private int age;

    public CustomException(String message, Throwable cause, String name, int age) {
        super(message, cause);
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
