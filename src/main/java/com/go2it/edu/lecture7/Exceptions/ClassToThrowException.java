package com.go2it.edu.lecture7.Exceptions;

import java.io.FileNotFoundException;

public class ClassToThrowException {
    private String title;

    public ClassToThrowException(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws FileNotFoundException {
        if (title == null || title.isEmpty()) {
//            throw new IllegalArgumentException("The title was empty, could not set it up");
            throw new FileNotFoundException("Some random exception was thrown"); // e.getMessage(
        }
        this.title = title;
    }
}
