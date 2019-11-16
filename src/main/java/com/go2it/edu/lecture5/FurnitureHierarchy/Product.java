package com.go2it.edu.lecture5.FurnitureHierarchy;

import javax.swing.*;

public class Product {
    private int price;
    private String color;
    private String producer;
    private String material;

    public Product(int price, String color, String producer, String material) {
        this.price = price;
        this.color = color;
        this.producer = producer;
        this.material = material;
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

    public String getProducer() {
        return producer;
    }

    public String getMaterial() {
        return material;
    }

}
