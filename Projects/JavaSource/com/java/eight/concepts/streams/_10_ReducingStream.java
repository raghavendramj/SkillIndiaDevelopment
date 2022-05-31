package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class _10_ReducingStream {
    public static void main(String[] args) {

        int arr[] = {2, 1, 3, 4, 6, 5, 8, 9, 10};

        int mySum = 0;
        for (int num : arr) {
            mySum += num;
        }
        System.out.println("IMPERATIVE :- sumOfNumbers -> :- " + mySum);

        System.out.println("Sum is " + mySum);
        int sumOfNumber = Arrays.stream(arr).reduce(0, (accumulator, currentValue) -> {
            System.out.println("Accumulator : " + accumulator + " and currentValue : " + currentValue);
            return accumulator + currentValue;
        });

        System.out.println("DECLATATIVE :- sumOfNumbers -> :- " + Arrays.stream(arr).reduce(0, (a, b) -> a + b));
        OptionalInt optionalInt = Arrays.stream(arr).reduce((a, b) -> a + b);

        if (optionalInt.isPresent()) {
            System.out.println("DECLATATIVE :- sumOfNumbers -> :- " + optionalInt.getAsInt());
        } else {
            System.out.println("Empty Array");
        }

        OptionalInt reducedSum = Arrays.stream(arr).reduce(Integer::sum);

        if (reducedSum.isPresent()) {
            System.out.println("Sum is " + reducedSum.getAsInt());
        }

    }
}
