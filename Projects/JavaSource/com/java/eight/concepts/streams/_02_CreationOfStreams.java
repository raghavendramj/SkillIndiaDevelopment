package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _02_CreationOfStreams {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // Create streams from an array or a collection
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(number -> System.out.print(number + " "));

        List<String> names = Arrays.asList("Raghava", "Keshava", "Madhava");
        System.out.println("\nNames are....");
        names.stream().forEach(name -> System.out.print(name + "  "));
        System.out.println("\n\nNames using Method Reference are....");
        names.stream().forEach(System.out::println);

        // Create streams using generate function
        Supplier<Double> doubleSupplier = () -> Math.random();
        Stream<Double> doubleStream = Stream.generate(doubleSupplier).limit(10);
        System.out.println("\n\nStreams using generate....");
        doubleStream.forEach(number -> System.out.println(number + "  "));

        // Create streams using iterate function
        UnaryOperator<Integer> integerFunction = number -> number + 1;
        Stream<Integer> integerStream = Stream.iterate(1, integerFunction).limit(10);
        System.out.println("\n\nStreams using iterate....");
        integerStream.forEach(number -> System.out.print(number + " "));
    }
}
