package com.go2it.edu.lecture7.customexception;

public class MyException extends Exception {
    private  int errorCode;

    public MyException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
