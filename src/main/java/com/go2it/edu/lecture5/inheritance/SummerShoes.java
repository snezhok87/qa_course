package com.go2it.edu.lecture5.inheritance;

//Summer
//        sandals
//        flip flops
//        flats
public class SummerShoes extends Shoes {
    private String size;
    private int material;

    public SummerShoes() {
    }

    public SummerShoes(int size, String material, Double price) {
        super(size, material, price);
    }

//    @Override
//    public String getSize() {
//        return size;
//    }
//
//    public void setSize(String size) {
//        this.size = size;
//    }
//
//    @Override
//    public int getMaterial() {
//        return material;
//    }
//
//    public void setMaterial(int material) {
//        this.material = material;
//    }
}
