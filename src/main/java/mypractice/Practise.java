package mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practise {
    public static void main(String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune));
        solarSystem.add(mercury); // this method will add first value of String
//      or I can call all list of solarSystem Arrays.asList(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune)

        Collections.sort(solarSystem);
//      method Sort will sort the list by alphabet order
        System.out.println(solarSystem);

        System.out.println(solarSystem.get(5)); // will get the index of collections solar System

        Collections.reverse(solarSystem);
 //     i will get the list in reverse order
        System.out.println(solarSystem);


        ArrayList<String> solarSystemPart1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
        ArrayList<String> solarSystemPart2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));
//      disjoint method will check if collections have intersection, return true or false
        System.out.println(Collections.disjoint(solarSystemPart1, solarSystemPart2));
    }
}
