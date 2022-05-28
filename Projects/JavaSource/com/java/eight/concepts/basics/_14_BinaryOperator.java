package com.java.eight.concepts.basics;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class _14_BinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<Integer> addNumbersBinaryOperator = (a, b) -> a + b;
        Integer result = addNumbersBinaryOperator.apply(12, 78);
        System.out.println("addNumbersBinaryOperator -> "+ result);


        Function<Integer, Integer> squareANumber = number -> number * number;

        BiFunction<Integer, Integer, Integer> integerBiFunction = addNumbersBinaryOperator.andThen(squareANumber);

        Integer addAndSquared = integerBiFunction.apply(5, 6);

        System.out.println("addAndSquared -> "+ addAndSquared);


    }
}
