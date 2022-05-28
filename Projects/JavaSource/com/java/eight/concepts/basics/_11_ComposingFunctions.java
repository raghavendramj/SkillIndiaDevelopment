package com.java.eight.concepts.basics;

import java.util.function.Function;

public class _11_ComposingFunctions {


    public static void main(String[] args) {


        //1. name -> raghavendra -> UPPERCASE
        //2. name -> name:11 +  -> RAGHAVENDRA:11
        //3. name -> {name:length} -> {RAGHAVENDRA = 11}

        Function<String, String> convertToUppercase = name -> name.toUpperCase();
        System.out.println("convertToUppercase -> " + convertToUppercase.apply("raghavendra"));

        Function<String, String> makeKeyValuePair = str -> str + ":" + str.length();
        System.out.println("makeKeyValuePair -> " + makeKeyValuePair.apply("raghavendra"));

        Function<String, String> appendBrackets = str -> "{ " + str + " }";
        System.out.println("appendBrackets -> " + appendBrackets.apply("raghavendra"));

        String myName = "raghavendra";
        String raghavendra = convertToUppercase.andThen(makeKeyValuePair).andThen(appendBrackets).apply(myName);
        System.out.println("FINAL RESULT :-" + raghavendra);


    }
}
