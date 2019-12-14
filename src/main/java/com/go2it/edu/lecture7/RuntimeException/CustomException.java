package com.go2it.edu.lecture7.RuntimeException;

public class CustomException extends Exception {
    private int errorCode;
    static int numberOfObjectCreated=0;

    public CustomException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
        numberOfObjectCreated++;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
