package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;

public class _07_UniqueValues {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 1, 2, 1, 3};
        Arrays.stream(arr).distinct().forEach(number -> System.out.print(number + " "));

        List<Movie> movies = Arrays.asList(
                new Movie("Gehraiyaan", 45),
                new Movie("Badhaai Do", 12),
                new Movie("Runway 34", 33),
                new Movie("A Thursday", 17),
                new Movie("Toolsidas Junior", 56),
                new Movie("The Kashmir Files", 23), //hashcode -> different
                new Movie("The Kashmir Files", 23), //hashcode -> different
                new Movie("Badhaai Do", 12),
                new Movie("Bachchhan Paandey", 43),
                new Movie("Runway 34", 33),
                new Movie("Rocket Gang", 19),
                new Movie("A Thursday", 17));

        movies.stream().distinct().forEach(System.out::println);

    }
}
