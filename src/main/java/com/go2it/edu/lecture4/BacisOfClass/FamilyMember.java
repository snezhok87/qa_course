package com.go2it.edu.lecture4.BacisOfClass;

import java.time.LocalDate;

public class FamilyMember {

    private String name;
    private LocalDate dateOfBirth;
    private int roomNumber;
    private String favoriteDish;

    public FamilyMember(String name, LocalDate dateOfBirth, int roomNumber, String favoriteDish){
        this.name = name;
        this.dateOfBirth = LocalDate.now();
        this.roomNumber= roomNumber;
        this.favoriteDish=favoriteDish;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getFavoriteDish() {
        return favoriteDish;
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


