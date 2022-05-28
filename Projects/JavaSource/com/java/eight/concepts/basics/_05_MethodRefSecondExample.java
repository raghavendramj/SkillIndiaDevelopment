package com.java.eight.concepts.basics;


interface Adder {
    int add(int a, int b);
}

class Operations {
    int addNumbers(int a, int b) {
        System.out.println("Inside Operations::addNumbers()");
        return a + b;
    }

    static int addAndPrintNumbers(int a, int b){
        System.out.println("Number 1 :- "+a);
        System.out.println("Number 2 :- "+b);
        int result = a + b;
        System.out.println("Result is "+ result);
        return result;
    }
}

public class _05_MethodRefSecondExample {

    public static void main(String[] args) {
        Operations operations = new Operations();
        //Instance Method  -> Method of Functional interface
        // Concept => Method Reference :: Instance Member
        Adder adder = operations::addNumbers;
        adder.add(12, 44);

        System.out.println("\n---------------------------------");

        //Static Method -> Method of Functional interface
        // Concept => Method Reference :: Static Member
        Adder secondAdder = Operations::addAndPrintNumbers;
        secondAdder.add(44, 67);
    }
}
