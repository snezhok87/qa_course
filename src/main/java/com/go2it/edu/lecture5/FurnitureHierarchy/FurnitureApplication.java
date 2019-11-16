package com.go2it.edu.lecture5.FurnitureHierarchy;

public class FurnitureApplication {
    public static void main(String[] args) {

        Office example1 = new Office(25, "black", "BuildCo", "wood", "modern", 2018);
        System.out.println(example1);

        Furniture furniture = new Furniture(125, "white", "ARGO", "textile", "minimalist", 2005);
        furniture.assembly(7);

        Table table1= new Table(220, "black","LMT", "wood", "industrial", 2009, "oval");
        Table table2= new Table(220, "black","LMT", "wood", "industrial", 2009, "oval");

        System.out.println(table1.equals(table2));
    }

}
