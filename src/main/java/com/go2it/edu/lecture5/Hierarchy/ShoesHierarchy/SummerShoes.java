package com.go2it.edu.lecture5.Hierarchy.ShoesHierarchy;

//Summer
//        sandals
//        flip flops
//        flats
public class SummerShoes extends Shoes {
    private String typeOfSummerShoes;

    public SummerShoes() {
    }

    public SummerShoes(int size, String material, Double price, String typeOfSummerShoes) {
        super(size, material, price);
        this.typeOfSummerShoes = typeOfSummerShoes;
    }

    public String getTypeOfSummerShoes() {
        return typeOfSummerShoes;
    }

    public void setTypeOfSummerShoes(String typeOfSummerShoes) {
        this.typeOfSummerShoes = typeOfSummerShoes;
    }
}
