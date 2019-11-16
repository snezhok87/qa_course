package com.go2it.edu.lecture5.FurnitureHierarchy;

public class Furniture extends Product{
    private String style;
    private int yearOfProduce;

    public Furniture(int price, String color, String producer, String material, String style, int yearOfProduce) {
        super(price, color, producer, material);
        this.style = style;
        this.yearOfProduce = yearOfProduce;
    }

    public String getStyle() {
        return style;
    }

    public int getYearOfProduce() {
        return yearOfProduce;
    }

    public void assembly(int assemblyTime) {
        System.out.println("This furniture will assemble " + assemblyTime + " hours");
    }
}
