package com.java.collections;

@FunctionalInterface
interface testInterface {

    //Static Methods
    static int subtract(int a, int b) {
        return a + b;
    }
    //Default Methods
    default int multiply(int a, int b) {
        return a + b;
    }
    int add(int a, int b);
}


public class Java8Interface {
}
