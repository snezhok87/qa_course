package com.go2it.edu.lecture5.FurnitureHierarchy;

public class TvSet extends LivingRoom {
    private int diagonal;

    public TvSet(int price, String color, String producer, String material, String style, int yearOfProduce, int diagonal) {
        super(price, color, producer, material, style, yearOfProduce);
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }
}
