package mypractice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog(); // создаем объект Dog
        dog1.bark();
        dog1.name = "Bart";

        // создадим массив типа Dog
        Dog[] myDogs = new Dog[3];
        // и поместим несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Alex";
        myDogs[1].name = "Jack";
        // какое имя у Dog[2]
        System.out.print("The last dog's name is ");
        System.out.println(myDogs[2].name);
        // теперь переберем все элементы массива и вызовем для каждого метод bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says WOOF");
    }

    public void eat() {    }

    public void chaseCat() {    }
}
