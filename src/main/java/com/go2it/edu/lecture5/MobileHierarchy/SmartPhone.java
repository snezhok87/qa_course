package com.go2it.edu.lecture5.MobileHierarchy;

public class SmartPhone extends MobilePhone {
    private double displaySize;
    private int memorySize;

    public SmartPhone(int customerRating, MobilePhone.MobileProducer producer, int price, String color, double displaySize, int memorySize) {
        super(customerRating, producer, price, color);
        this.displaySize = displaySize;
        this.memorySize = memorySize;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void playMusic(String audioTrack) {
        System.out.println(audioTrack + " song is playing");
    }

    public void navigate(String address) {
        System.out.println("Navigating to the address " + address);
    }

    public void watchVideo(String video) {
        System.out.println("Watching video " + video);
    }

//    @Override
    public void ring() {
       System.out.println("Using smart melody ");
       playMusic("Burn the house down");
       super.ring();
    }
}
