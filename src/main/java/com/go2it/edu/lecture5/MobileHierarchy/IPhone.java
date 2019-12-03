package com.go2it.edu.lecture5.MobileHierarchy;

public class IPhone extends SmartPhone {

    public IPhone(int customerRating, int price, String color, double displaySize, int memorySize) {
        super(customerRating, MobileProducer.APPLE, price, color, displaySize, memorySize);
    }

    public void askSiri(String request) {
        System.out.println("asking Siri "+ request);
    }

    @Override
    public void navigate(String address) {
        System.out.println("Navigate by Apple Maps");
        super.navigate(address);
    }
}
