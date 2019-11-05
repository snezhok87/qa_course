package com.go2it.edu.lecture4.BacisOfClass;

public class Boat {
    private double volume;
    private double speed;
    private boolean hasSail;
    private boolean hasEngine;
    private int numberOfRoom;
    String title;
    private String country;

    public String getTitle(){     // 2 way- get and set methods
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public boolean isHasSail() {
        return this.hasSail;
    }

    public void setHasSail(boolean hasSail){
        this.hasSail = hasSail;
    }

//    public Boat(String title){    //3 way -constructor
//    this.title = title;
    }

