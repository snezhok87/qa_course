package com.go2it.edu.lecture5.Hierarchy.AnimalHierarchy;

public class Main {
    public static void main(String[] args) {
        Bird stork = new Bird(true,2,"millet", "feather", true);
        stork.jump(true);
        Bird swan = new Bird(true, 2, "seaweed","feather", true);
        swan.swim(true);

        Insect ant = new Insect(true,6, "sugar", "chitinous shell", false);
        ant.eat("berry");
        Insect spider = new Insect(false, 8, "insects", "exoskeleton", false);
        spider.run(8);

        Fish shark= new Fish(false, 0, "plankton","scale", true);
        shark.swim(true);

        Predator crocodile = new Predator(false, 4,"animals", "shell", true);
        crocodile.sleep(false);
    }
}
