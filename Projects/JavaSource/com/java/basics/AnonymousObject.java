package com.java.basics;

interface Calculator {
    int add(int a, int b);

    int subtract(int a, int b);

    int mulitply(int a, int b);
}

public class AnonymousObject {

    public static void main(String[] args) {

        //Anonymous Object
        Calculator calculator = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int subtract(int a, int b) {
                return a - b;
            }

            @Override
            public int mulitply(int a, int b) {
                return a * b;
            }
        };
        System.out.println("Add :- " + calculator.add(10, 20));
        System.out.println("Subtract :- " + calculator.subtract(42, 20));
        System.out.println("Mulitply :- " + calculator.mulitply(10, 20));
    }
}
