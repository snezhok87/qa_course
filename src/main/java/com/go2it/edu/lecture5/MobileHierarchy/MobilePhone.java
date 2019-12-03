package com.go2it.edu.lecture5.MobileHierarchy;

public class MobilePhone {

    private int customerRating;
    private MobileProducer producer;
    private int price;
    private String color;

    public MobilePhone(int customerRating, MobileProducer producer, int price, String color) {
        this.customerRating = customerRating;
        this.producer = producer;
        this.price = price;
        this.color = color;
    }

    public enum MobileProducer {
        APPLE, NOKIA, SAMSUNG, SONY, LG, MOTOROLA;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getCustomerRating() {
        return customerRating;
    }

    public void setCustomerRating(int customerRating) {
        this.customerRating = customerRating;
    }

    public void calculate(int numberOfDigits) {
        System.out.println("This phone can calculate");
    }

    public void ring() {
        System.out.println("The phone is ringing ");
    }

    public void textMessage(String mes) {
        System.out.println("Sending message " + mes);
    }

//overload

    /**
     * prints "The phone is ringing with " + melodyName + " melody" if vibration = false
     * prints "The phone is ringing with " + melodyName + " melody and vibration" if vibration = true
     *
     * @param melodyName melody name
     * @param vibration  vibration
     */
    public void ring(String melodyName, boolean vibration) {
        String result = "The phone is ringing with " + melodyName + " melody ";
        if (!vibration) {
            System.out.println(result);
        } else {
            System.out.println(result + "and vibration");
        }
    }
}
