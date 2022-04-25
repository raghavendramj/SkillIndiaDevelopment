package com.java.basics;


//This is an abstract
abstract class Animal {

    //Concrete method / non-abstract method -> 33%
    public void eat(String name, String foodName) {
        System.out.println("Animal " + name + " eats " + foodName);
    }

    //Abstract method -> 66%
    public abstract void move(); // -> 33%
    public abstract void sleep(); // -> 33%
}


class Lion extends Animal {

    @Override
    public void move() {
        System.out.println("Lion walks");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps in a den");
    }
}


class Tortoise extends Animal {

    @Override
    public void move() {
        System.out.println("Tortoise can also walk and swim in the water");
    }

    @Override
    public void sleep() {
        System.out.println("Tortoise sleeps in dark areas");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Lion animal = new Lion();
        animal.eat("Lion", "Flesh");
        animal.eat("Lion", "Flesh");
    }
}
