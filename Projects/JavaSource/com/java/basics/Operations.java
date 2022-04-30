package com.java.basics;

public class Operations {

    public static void main(String[] args) {

        Operations operations = new Operations();
        System.out.println("addition(int a, int b) : " + operations.addition(10, 20));
        System.out.println("addition(short a, int b) : " + operations.addition((short) 10, 20));
        System.out.println("addition(long a, int b) : " + operations.addition((long) 10, 20));
        System.out.println("addition(int a, int b, int c) : " + operations.addition(10, 20, 30));
    }

    public int addition(int a, int b) {
        System.out.println("Invoking addition(int a, int b)");
        return a + b;
    }

    public long addition(short a, int b) {
        System.out.println("Invoking addition(short a, int b)");
        return a + b;
    }

    public long addition(long a, int b) {
        System.out.println("Invoking addition(long a, int b)");
        return a + b;
    }

    public long addition(long a, long b) {
        System.out.println("Invoking addition(long a, long b)");
        return a + b;
    }

    public int addition(int a, int b, int c) {
        System.out.println("Invoking addition(int a, int b, int c)");
        return a + b + c;
    }
}
