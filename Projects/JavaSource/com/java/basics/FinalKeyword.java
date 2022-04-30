package com.java.basics;


final class Accessories {
    final int radius = 10;

    public void draw() {
        System.out.println("This is draw method!");
    }
}


class Computer {

    public final void switchOnSystem() {
        System.out.println("Siwtching it on!");
    }
}

//Cannot inherit from final 'com.java.basics.Accessories'
//public class FinalKeyword extends Accessories{
public class FinalKeyword extends Computer {

    //'switchOnSystem()' cannot override 'switchOnSystem()' in 'com.java.basics.Computer';
    // overridden method is final
//    public void switchOnSystem(){
//
//    }


    private static final float pi = 3.142f;

    public static void main(String[] args) {

        System.out.println("Value of final :- " + pi);
        // pi = 12.34f; //Cannot assign a value to final variable 'pi'

        Accessories accessories = new Accessories();
        accessories.draw();

    }
}

/*
* FINAL VARIABLES -> CANT BE MODIFIED
* FINAL CLASS -> CANT BE INHERITED
* FINAL METHOD -> CANT BE OVERRIDDEN*
*
* */