package com.java.basics;

public class NestedClassDemo {
    //Nested CLASS
    class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        int subtract(int a, int b) {
            return a - b;
        }
    }

    public static void main(String[] args) {
        NestedClassDemo object = new NestedClassDemo();
    }

    public void createObj() {
        Calculator calculator = new Calculator();
        System.out.println("Addition add(10, 20) " + calculator.add(10, 20));
        System.out.println("subtract subtract(10, 20) " + calculator.subtract(56, 20));
    }


}
