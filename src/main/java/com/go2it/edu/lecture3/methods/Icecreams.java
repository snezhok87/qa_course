package com.go2it.edu.lecture3.methods;
/*Поскольку задание мы фактически сделали на занятии, хочу попросить вас попробывать следующте комбинации:
        - вызов статика в инстанс
        - вызов инстанс в статик
        - вызов инстанс без создания объекта
        - вызов статика без объекта
        - вызов статика на объекте (наподобие инстанс)*/

public class Icecreams {
    public void typeOfIcecream() { // instance method
       String type1 = "Chocolate";
       String type2 = "Vanilla";

       price();
    }

    public static void price (){
    int a = 12;
    int b = 9;
    int c = a+b;
        System.out.println("The total price for icecream is: " + c);

    }

    public static void main(String[] args) {

    }

}
