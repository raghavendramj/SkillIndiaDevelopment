package com.java.basics;


class Animals {
    public void eatFood() {
        System.out.println("Animals eats food");
    }
}

class Elephant extends Animals {

    //OVERRIDING -> EXCAT -> accessmodifier, returntype, function name and params
    @Override
    public void eatFood() {
        System.out.println("Elephant eats only grass/vegeterian food");
    }
}


public class Ovevrriding {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.eatFood();
    }
}
