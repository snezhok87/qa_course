package com.go2it.edu.lecture5.Hierarchy.ShoesHierarchy;

public class TestShoes {
    public static void main(String[] args) {
        Shoes shoes = new Shoes(6, "nubuck", 105.50);
        shoes.getSize();
        System.out.println("For winter we have brand " + shoes.getBrand() + ", " + "size is " + shoes.getSize());
        WinterShoes boots = new WinterShoes(4, "leather", 125.60, 5);
        WinterShoes waterproofBoots = new WinterShoes(28, "nubuck", 256.50, 10);
    }

}
