package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _12_GroupingElements {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("A", 10, Genre.THRILLER),
                new Movie("B", 15, Genre.ACTION),
                new Movie("B", 20, Genre.ACTION),
                new Movie("C", 20, Genre.COMEDY),
                new Movie("E", 10, Genre.THRILLER),
                new Movie("E", 15, Genre.THRILLER),
                new Movie("F", 15, Genre.ACTION),
                new Movie("G", 20, Genre.COMEDY)
        );

        Map<Integer, List<Movie>> integerListMap = movies.stream().collect(Collectors.groupingBy(Movie::getLikes, Collectors.toList()));

        System.out.println("integerListMap -> "+ integerListMap);

        Map<Integer, Long> integerLongMap = movies.stream()
                .collect(Collectors.groupingBy(Movie::getLikes, Collectors.counting()));
        System.out.println("integerListMap -> "+ integerLongMap);

        Map<Genre, String> genreStringMap = movies.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.mapping(Movie::getTitle, Collectors.joining("->"))));
        System.out.println("genreStringMap -> "+ genreStringMap);
    }

}
