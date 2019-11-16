package com.go2it.edu.lecture5.FurnitureHierarchy;

public class FirePlace extends LivingRoom {
    private String artificial; // or boolean type?
    private String natural;

    public FirePlace(int price, String color, String producer, String material, String style, int yearOfProduce) {
        super(price, color, producer, material, style, yearOfProduce);
    }

    public String getArtificial() {
        return artificial;
    }

    public String getNatural() {
        return natural;
    }
}
