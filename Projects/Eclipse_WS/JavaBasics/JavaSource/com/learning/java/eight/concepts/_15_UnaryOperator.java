package com.java.eight.concepts;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class _15_UnaryOperator {

    public static void main(String[] args) {

        UnaryOperator<Integer> squareUnaryOperator =  number -> number * number;
        Integer squaredResult = squareUnaryOperator.apply(12);

        System.out.println("Output : "+squaredResult);
        UnaryOperator<Integer> doubleItSelfUnaryOperator =  number -> number + number;
        System.out.println("incrementUnaryOperator -> "+ doubleItSelfUnaryOperator.apply(6));

        Function<Integer, Integer> doubleAndSquareFunction = doubleItSelfUnaryOperator.andThen(squareUnaryOperator);
        System.out.println("doubleAndSquareFunction -> "+ doubleAndSquareFunction.apply(7));

    }
}
