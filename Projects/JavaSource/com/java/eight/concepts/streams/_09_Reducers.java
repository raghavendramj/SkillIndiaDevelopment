package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _09_Reducers {

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

        boolean anyMatch = movies.stream().anyMatch(m -> m.getLikes() > 25);
        System.out.println("Is there any movie with 25+ likes :- " + anyMatch);
        System.out.println("Are all movies has 20+ likes :- " + movies.stream().allMatch(m -> m.getLikes() > 20));
        System.out.println("None matching < 10 likes :- " + movies.stream().noneMatch(m -> m.getLikes() < 10));
        System.out.println("findFirst :- " + movies.stream().findFirst().get());
        System.out.println("findAny :- " + movies.stream().findAny().get());
        System.out.println("Movie with max likes :- " + movies.stream().max(Comparator.comparing(Movie::getLikes)));
        System.out.println("Movie with min likes :- " + movies.stream().min(Comparator.comparing(Movie::getLikes)));
    }
}
