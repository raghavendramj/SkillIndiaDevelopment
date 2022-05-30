package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _02_CreationOfStreams {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // Create streams from an array
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(number -> System.out.print(number + " "));

        String names[] = {"reet", "satya", "manu", "tanu", "megha"};
        Stream<String> namesStream = Arrays.stream(names);
        System.out.println("\n-----------------STRING STREAM ------------------");
        namesStream.forEach(name -> System.out.print(name + " "));

        // Create streams from a collection
        List<String> movieNames = Arrays.asList("Don", "KGF", "RRR", "Sholay", "Bahubali", "Googly", "DDLJ", "Runway34");
        Stream<String> moviesStream = movieNames.stream();

        System.out.println("\n-----------------STRING STREAM MOVIES FROM COLLECTION------------------");

        Predicate<String> isLengthGt5 = myMovie -> myMovie.length() > 5;
        Consumer<String> printMovie = customizedMovie -> System.out.println(customizedMovie + " ");
        moviesStream
                .filter(isLengthGt5) //Predicate -> isLengthGt5
                .forEach(printMovie); // Consumer printMovie

        // Create streams using generate function
        Supplier<Double> randonNumberGenerator = () -> Math.random() * 1000;
        System.out.println("\n-----------------STREAM USING GENERATE------------------");
        Stream.generate(randonNumberGenerator).limit(10).forEach(num -> System.out.println(num));

        //Create stream using Iterate function
        UnaryOperator<Integer> integerUnaryOperator = number -> number + 1;
        System.out.println("\n-----------------STREAM USING ITERATE------------------");
        Stream.iterate(1, integerUnaryOperator).limit(10).forEach(num -> System.out.print(num + " -> "));
    }
}
