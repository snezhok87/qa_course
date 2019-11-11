package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;

public class Child extends Parent {
    private String gender;

    public Child(String name, LocalDate dateOfBirth, int roomNumber, String favoriteDish, int numberOfChildren, String gender) {
        super(name, dateOfBirth, roomNumber, favoriteDish, numberOfChildren);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

}
