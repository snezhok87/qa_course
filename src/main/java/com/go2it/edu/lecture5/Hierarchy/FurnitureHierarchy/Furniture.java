package com.go2it.edu.lecture5.Hierarchy.FurnitureHierarchy;

public class Furniture extends Product {
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
        if (assemblyTime >= 5) {
            System.out.println("This furniture is hard to assemble");
        } else {
            System.out.println("This furniture will assemble " + assemblyTime + " hours");
        }
    }
    @Override
    public String toString(){

        return "This is FURNITURE with Values: year of produce " + yearOfProduce;
    }

//    @Override
//    public String toString() {
//        return "Furniture{" +
//                "style='" + style + '\'' +
//                ", yearOfProduce=" + yearOfProduce +
//                '}';
//    }
}
