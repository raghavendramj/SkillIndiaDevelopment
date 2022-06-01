package com.java.eight.concepts.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _11_Collectors {

    public static void main(String[] args) {
        //Terminal Operations

        List<Movie> movies = Arrays.asList(
                new Movie("Don", 15),
                new Movie("KGF", 56),
                new Movie("RRR", 43),
                new Movie("Sholay", 51),
                new Movie("Bahubali", 34),
                new Movie("Googly", 67),
                new Movie("DDLJ", 26),
                new Movie("Runway34", 23));


        List<String> namesOfMovies = movies.stream()
                .map(movie -> movie.getTitle())
                .collect(Collectors.toList());
        System.out.println("namesOfMovies -> " + namesOfMovies);
        List<Movie> movieList = movies.stream()
                .filter(m -> m.getLikes() > 30)
                .collect(Collectors.toList());
        System.out.println("movielikes > 30 List -> " + movieList);
        Set<Movie> movieSet = movies.stream()
                .filter(m -> m.getLikes() > 30)
                .collect(Collectors.toSet());
        System.out.println("\nmovielikes > 30 Set -> " + movieSet);


        Map<Integer, Movie> collectedMoviesWithLikesAsKey = movies.stream()
                .collect(Collectors.toMap(Movie::getLikes, m -> m));
        Map<String, Movie> collectedMoviesWithTitleAsKey = movies.stream()
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println("\nList of movies mapped :- collectedMoviesWithLikesAsKey ");
        System.out.println(collectedMoviesWithLikesAsKey);
        System.out.println("\nList of movies mapped :- collectedMoviesWithLikesAsKey ");
        System.out.println(collectedMoviesWithTitleAsKey);

        Integer sumofLikes = movies.stream()
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println("\nLikes sum is " + sumofLikes);

        IntSummaryStatistics summaryStatistics = movies.stream()
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println("\nsummaryStatistics sum is " + summaryStatistics);

        String allMoviesString = movies.stream().map(Movie::getTitle).collect(Collectors.joining("--"));
        System.out.println("\nallMoviesString is " + allMoviesString);
    }
}
