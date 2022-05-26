package com.java.eight.concepts;

import java.util.function.Predicate;

public class _12_Predicates {


    public static void main(String[] args) {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        System.out.println("Raghav > 5 characters : " + isLongerThan5.test("raghav"));
        System.out.println("sky > 5 characters : " + isLongerThan5.test("sky"));
    }
}
