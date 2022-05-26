package com.java.eight.concepts;

interface Operation {
    int add(int a, int b);

    int subtract(int a, int b);
}

//Implementation for a interface..
class OperateClass implements Operation {
    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        return 0;
    }
}

public class _07_AnnonymousClassDemo {

    public static void main(String[] args) {
        //In place implementation for a interface.. => Anonymous class
        Operation operation = new Operation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int subtract(int a, int b) {
                return a - b;
            }
        };

        System.out.println("add(10+23) :- " + operation.add(10, 23));
    }
}
