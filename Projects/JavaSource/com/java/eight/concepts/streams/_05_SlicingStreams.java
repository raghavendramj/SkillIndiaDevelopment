package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;

public class _05_SlicingStreams {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Gehraiyaan", 45),
                new Movie("Badhaai Do", 12),
                new Movie("A Thursday", 17),
                new Movie("Toolsidas Junior", 56),
                new Movie("The Kashmir Files", 23),
                new Movie("Bachchhan Paandey", 43),
                new Movie("Runway 34", 33),
                new Movie("Rocket Gang", 19));



        System.out.println("------------------ Limiting to only 2 ------------------ ");
        movies.stream().limit(2).forEach(movie -> System.out.println(movie));
        System.out.println("\n------------------ After skipping 2 ---------------------");
        movies.stream().skip(3).limit(2).forEach(movie -> System.out.println(movie));

        //1000 movies
        //10 movies -> page
        //3rd -> skip(20) -> skip(page-1 * pageSize)
        //limit (10) -> pageSize = 10

    }
}
