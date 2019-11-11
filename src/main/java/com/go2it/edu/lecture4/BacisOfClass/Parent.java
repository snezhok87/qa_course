package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;

public class Parent extends FamilyMember {
    private int numberOfChildren;

    public Parent(String name, LocalDate dateOfBirth, int roomNumber, String favoriteDish, int numberOfChildren) {
        super(name, dateOfBirth, roomNumber, favoriteDish);
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
}
