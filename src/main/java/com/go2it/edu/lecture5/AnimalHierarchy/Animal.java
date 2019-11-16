package com.go2it.edu.lecture5.AnimalHierarchy;

public class Animal {
    private boolean vegetarian;
    private int numberOfLegs;
    private String food;
    private String cover;
    private boolean swimmer;

    public Animal(boolean vegetarian, int numberOfLegs, String food, String cover, boolean swimmer) {
        this.vegetarian = vegetarian;
        this.numberOfLegs = numberOfLegs;
        this.food = food;
        this.cover = cover;
        this.swimmer = swimmer;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCover() {
        return cover;
    }

    public boolean isSwimmer() {
        return swimmer;
    }

    public void setSwimmer(boolean swimmer) {
        this.swimmer = swimmer;
    }

    public void eat(String meal) {
        if (meal.equals(food)) {
            System.out.println("I am eating " + food);
        } else {
            System.out.println("I do not like " + meal);
        }
    }

    public void jump(boolean swimmer) {
        if (swimmer) {
            System.out.println("I can not jump");
        } else {
            System.out.println("I can jump");
        }
    }

    public void run(int numberOfLegs) {
        if (numberOfLegs >= 2) {
            System.out.println("I can run");
        } else {
            System.out.println("I am a swimmer");
        }
    }

    public void swim(boolean swimmer){
        System.out.println("I can swim");
    }

    public void sleep(boolean vegetarian) {
        if(vegetarian){
            System.out.println("I sleep in the dark");
        }else{
            System.out.println("I sleep a little, as I am a predator");
        }
    }
}

