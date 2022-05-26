package com.java.eight.concepts;

import java.util.function.Function;

public class _10_FunctionInterface {

    public static void main(String[] args) {
        //Via Lambda Expression
        Function<String, Integer> fetchSize = str -> str.length();
        System.out.println("Length of my name : "+ fetchSize.apply("Raghavendra"));
    }
}
