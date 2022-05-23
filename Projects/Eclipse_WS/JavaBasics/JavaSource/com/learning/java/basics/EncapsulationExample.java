package com.java.basics;

class CounterTest {
    //Instance Variables
    private int counter = 0;

    //Parameterized Constructor
    public CounterTest(int counter) {
        System.out.println("Parameterized Constructor");
        this.counter = counter;
    }

    //Default Constructor
    public CounterTest() {
        System.out.println("Default Constructor");
    }

    //Instance Methods or Non Static Methods
    public int getCouter() {
        return counter;
    }

    public void setCounter(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Invalid Value for counter");
        }
        this.counter = value;
    }

    @Override
    public String toString() {
        return "CounterTest{" +
                "counter=" + counter +
                '}';
    }
}


public class EncapsulationExample {

    public static void main(String[] args) {
        int a = 10; //Local Variable.

        System.out.println("\nExample of default constructor");
        CounterTest counterObject1 = new CounterTest();
        /*
         * CounterTest -> Reference Type (Classname)
         * counterObject1 -> Reference Variable / Object
         * new -> procure the memory(heap) and assign it to this object
         * constructor -> initialize the object
         *  1. CounterTest() -> Invokes default constructor
         *  2. CounterTest(10) -> Invokes parameterized constructor
         * */
        System.out.println("counterObject1 -> Before :- " + counterObject1.getCouter());
        counterObject1.setCounter(4);
        System.out.println("counterObject1 -> After :- " + counterObject1.getCouter());

        System.out.println("\nExample of parameterized constructor");
        CounterTest counterObject2 = new CounterTest(12);
        System.out.println("counterObject2 -> Before :- " + counterObject2.getCouter());
        counterObject2.setCounter(25);
        System.out.println("counterObject2 -> After :- " + counterObject2.getCouter());


        CounterTest counterObject3 = new CounterTest(34);
        System.out.println("\n*************** All the different Object values...");
        System.out.println("All -> counterObject1 -> :- " + counterObject1.getCouter());
        System.out.println("All -> counterObject2 -> :- " + counterObject2.getCouter());
        System.out.println("All -> counterObject3 -> :- " + counterObject3.getCouter());

        System.out.println(counterObject1);
    }
}
