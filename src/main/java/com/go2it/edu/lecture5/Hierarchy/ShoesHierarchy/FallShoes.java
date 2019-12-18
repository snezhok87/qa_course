package com.go2it.edu.lecture5.Hierarchy.ShoesHierarchy;

//Spring/Autumn
//        moccasins
//        loafers
//        sneakers
//        heels
public class FallShoes extends Shoes {
    private String typeOfFallShoes;

    public FallShoes() {
    }

    public FallShoes(int size, String material, Double price) {
        super(size, material, price);
    }

    public String getTypeOfFallShoes() {
        return typeOfFallShoes;
    }

    public void setTypeOfFallShoes(String typeOfFallShoes) {
        this.typeOfFallShoes = typeOfFallShoes;
    }
}
