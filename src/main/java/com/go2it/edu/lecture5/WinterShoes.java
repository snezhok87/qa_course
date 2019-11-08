package com.go2it.edu.lecture5;

public class WinterShoes extends Shoes{
    private  int numberOfWinterShoes;
    private String typeOfWinterShoes;

    public WinterShoes(){

    }

    public WinterShoes(int numberOfWinterShoes, String typeOfWinterShoes){
//        this.setNumberOfWinterShoes(numberOfWinterShoes);
//        this.setTypeOfWinterShoes(typeOfWinterShoes);

        // or to call constructor super class Shoes
        super(36, "leather", 106.50 );
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
