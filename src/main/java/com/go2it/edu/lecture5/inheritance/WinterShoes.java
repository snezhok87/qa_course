package com.go2it.edu.lecture5.inheritance;
//Winter
//        boots
//        uggs

public class WinterShoes extends Shoes {
    private int numberOfWinterShoes;
    private String typeOfWinterShoes;

//    public WinterShoes() {
//        System.out.println("Creating Winter Shoes");
//
//    }

    public WinterShoes(int numberOfWinterShoes, String typeOfWinterShoes, int size, String material, int price) {
        super(36, "leather", 106.50);
        System.out.println("Constructore of Winter SHoes");
        this.setNumberOfWinterShoes(numberOfWinterShoes);
        this.setTypeOfWinterShoes(typeOfWinterShoes);
    }

    public int getNumberOfWinterShoes() {
        return numberOfWinterShoes;
    }

    public void setNumberOfWinterShoes(int numberOfWinterShoes) {
        this.numberOfWinterShoes = numberOfWinterShoes;
    }

    public String getTypeOfWinterShoes() {
        return typeOfWinterShoes;
    }

    public void setTypeOfWinterShoes(String typeOfWinterShoes) {
        this.typeOfWinterShoes = typeOfWinterShoes;
    }
}
