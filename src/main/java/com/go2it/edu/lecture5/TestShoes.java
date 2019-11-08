package com.go2it.edu.lecture5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestShoes {
    public static void main(String[] args) {
        Shoes shoes = new Shoes(36, "leather", "NY", 36.36);
        shoes.getSize();
        System.out.println("For winter we have brand " + shoes.getBrand() + ", " + "size is " + shoes.getSize());
    }


}
