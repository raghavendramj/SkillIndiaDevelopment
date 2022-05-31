package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _08_PeekingElements {

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

        List<String> movieNames = movies.stream()
                .filter(movie -> movie.getLikes() > 25).peek(movie -> System.out.println("Peeked after filter -> " + movie))
                .map(movie -> movie.getTitle()).peek(movie -> System.out.println("Peeked after map -> " + movie))
                .collect(Collectors.toList());

        System.out.println("Movie Names : " + movieNames);
    }
}
