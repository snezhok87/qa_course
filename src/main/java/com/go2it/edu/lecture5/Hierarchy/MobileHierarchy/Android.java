package com.go2it.edu.lecture5.Hierarchy.MobileHierarchy;

public class Android extends SmartPhone {

    public Android(int customerRating, MobileProducer producer, int price, String color, double displaySize, int memorySize) {
        super(customerRating, producer, price, color, displaySize, memorySize);
    }

    public void heyGoogle(String request){
        System.out.println("Asking Google about " + request);
    }

    public void navigate(String address) {
        System.out.println("Using GoogleMaps to navigate to " + address);
        super.navigate(address);
    }
}
