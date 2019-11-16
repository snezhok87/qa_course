package com.go2it.edu.lecture5.FurnitureHierarchy;

import java.util.Objects;

public class Table extends Kitchen {
    private String shape;
    private int height;

    public Table(int price, String color, String producer, String material, String style, int yearOfProduce, String shape) {
        super(price, color, producer, material, style, yearOfProduce);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    //    @Override
//    public String toString() {
//        return "Table{" +
//                "shape='" + shape + '\'' +
//                '}';
//    }
    @Override
    public String toString() {

        return "This TABLE with Value: shape of table - " + shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return height == table.height &&
                Objects.equals(shape, table.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, height);
    }
}
