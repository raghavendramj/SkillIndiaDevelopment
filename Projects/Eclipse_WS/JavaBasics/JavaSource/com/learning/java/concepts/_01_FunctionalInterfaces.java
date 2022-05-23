package com.java.eight.concepts;


public class _01_FunctionalInterfaces {

    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();
        printer.print();
    }

    @FunctionalInterface
    interface Printer {
        void print(); //By Default PUBLIC ABSTRACT
    }

    static class ConsolePrinter implements Printer {

        @Override
        public void print() {
            System.out.println("Printing the contents!");
        }
    }


}
