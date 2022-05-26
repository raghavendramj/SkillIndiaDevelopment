package com.java.eight.concepts;

public class _03_LambdaExpression {

    public static void main(String[] args) {
        //Anonymous Class
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println("Message is " + message);
            }
        };
        //Lambda Expression
        Printer secondPrinter = (message) -> {
            System.out.println("Message is " + message);
        };
        //Lambda Expression - simplified
        Printer thirdPrinter = message -> System.out.println("Message is " + message);

        printer.print("This is Anonymous class implementation!");
        secondPrinter.print("This is Lambda Expression implementation!");
        thirdPrinter.print("This is Lambda Expression simplified implementation!");

        Operations operations = (a, b) -> a + b;
        System.out.println("Result is " + operations.add(10, 20));

    }

    @FunctionalInterface
    interface Operations {
        int add(int a, int b);
    }

    @FunctionalInterface
    interface Printer {
        void print(String message); //By Default PUBLIC ABSTRACT
    }
}
