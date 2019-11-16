package com.go2it.edu.lecture5.FurnitureHierarchy;

public class Table extends Kitchen {
    private String shape;

    public Table(int price, String color, String producer, String material, String style, int yearOfProduce, String shape) {
        super(price, color, producer, material, style, yearOfProduce);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
