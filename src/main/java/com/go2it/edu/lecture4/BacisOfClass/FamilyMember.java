package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;

public class FamilyMember {

    private String name;
    private LocalDate dateOfBirth = LocalDate.now(); // int
    private int roomNumber;
    private String favoriteDish;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getFavoriteDish() {
        return this.favoriteDish;
    }

    public void setFavoriteDish(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }

    public void eat(String dish) {
        if (dish.equals(favoriteDish)){
            System.out.println("This is my favourite dish: " + favoriteDish);
        } else {
            System.out.println("I am eating " + dish);
        }
    }

    public void goAsleep() {
        System.out.println(name + " goes to room number " + roomNumber);
    }

    public void callAnotherFamilyMember(String familyMemberName) {
        System.out.println("Hey " + familyMemberName);
    }

    public void listen() {
        System.out.println("I am listening you");
    }

}


