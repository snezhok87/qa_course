package com.go2it.edu.lecture5.Hierarchy.ShoesHierarchy;
//Winter
//        boots
//        uggs

public class WinterShoes extends Shoes {
    private int numberOfWinterShoes;

//    public WinterShoes() {
//        System.out.println("Creating Winter Shoes");
//
//    }

    public WinterShoes(int size, String material, Double price, int numberOfWinterShoes) {
        super(size, material, price);
        this.numberOfWinterShoes = numberOfWinterShoes;
    }

    public int getNumberOfWinterShoes() {
        return numberOfWinterShoes;
    }

    public void setNumberOfWinterShoes(int numberOfWinterShoes) {
        this.numberOfWinterShoes = numberOfWinterShoes;
    }

}
