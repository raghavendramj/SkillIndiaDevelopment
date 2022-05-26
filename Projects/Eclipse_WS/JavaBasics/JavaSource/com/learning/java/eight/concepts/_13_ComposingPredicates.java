package com.java.eight.concepts;

import java.util.function.Predicate;

public class _13_ComposingPredicates {


    public static void main(String[] args) {

        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX = (text) -> text.endsWith("x");

        Predicate<String> startsWithAAndEndsWithX = (text) -> startsWithA.test(text) && endsWithX.test(text);
        Predicate<String> startsWithAAndEndsWithX_v2 = startsWithA.and(endsWithX);

        String input = "A hardworking person must relax";
        System.out.println("startsWithAAndEndsWithX :- " + startsWithAAndEndsWithX.test(input));
        System.out.println("startsWithAAndEndsWithX_v2 :- " + startsWithAAndEndsWithX_v2.test(input));

        input = "A hardworking person must relax sometimes";
        Predicate<String> startsWithAOREndsWithX = startsWithA.or(endsWithX);
        System.out.println("startsWithAOREndsWithX :- " + startsWithAOREndsWithX.test(input));

    }
}
