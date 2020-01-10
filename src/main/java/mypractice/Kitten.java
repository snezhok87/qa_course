package mypractice;

import java.util.HashSet;
import java.util.Set;

public class Kitten {
    public static void main(String[] args) {
        Set<Kitten> kittens = createCats();

        kittens.remove(new Kitten());

        printCats(kittens);
    }

    public static Set<Kitten> createCats() {
        HashSet<Kitten> kittens = new HashSet<Kitten>();
        for (int i = 0; i < 5; i++) {
            Kitten kitten = new Kitten();
            kittens.add(kitten);
            System.out.println();
        }
        return kittens;
    }

    public static void printCats(Set<Kitten> kittens) {
        for (Kitten kitten : kittens) {
            System.out.println(kitten);
        }
    }

}

