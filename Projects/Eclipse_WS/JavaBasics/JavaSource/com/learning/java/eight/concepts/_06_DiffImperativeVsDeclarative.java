package com.java.eight.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _06_DiffImperativeVsDeclarative {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Imperative programming -> What system needs to do and also how to do it. (for, if/else, switch case)
        for (int i = 0; i < integerList.size(); i++) {
            int currentNumber = integerList.get(i);
            System.out.println("Current Number :- " + currentNumber);
        }

        //Declarative programming
        Consumer<Integer> printNumber = (item) -> {
            System.out.println(item);
        };
        integerList.forEach(printNumber);

    }

}
