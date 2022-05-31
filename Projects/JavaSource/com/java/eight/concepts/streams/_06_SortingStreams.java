package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class _06_SortingStreams {

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


        List<String> movieNames = Arrays.asList("Don", "KGF", "RRR", "Sholay", "Bahubali", "Googly", "DDLJ", "Runway34");

        System.out.println("\n----------- Ascending order using comparator impl ----------- ");
        Comparator<String> nameSorter = (a, b) -> a.compareTo(b);
        movieNames.stream().sorted(nameSorter).forEach(name -> System.out.print(name + "  "));

        System.out.println("\n-----------  Ascending order using Comparator.naturalOrder() ----------- ");
        Comparator<String> nameSorterNaturalOrder = Comparator.naturalOrder();
        movieNames.stream().sorted(nameSorterNaturalOrder).forEach(name -> System.out.print(name + "  "));

        System.out.println("\n-----------  Ascending order using (a, b) -> a.getTitle().compareTo(b.getTitle() ----------- ");
        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(movie -> System.out.println(movie));

        System.out.println("\n-----------  Ascending order simplified - movies ----------- ");
        Function<Movie, String> keyExtractorTitleFn = movie -> movie.getTitle();
        Function<Movie, Integer> keyExtractorLikesFn = movie -> movie.getLikes();
        movies.stream()
                .sorted(Comparator.comparing(keyExtractorLikesFn))
                .forEach(System.out::println);

        System.out.println("\n-----------  Descending order - movies ----------- ");
        movies.stream()
                .sorted(Comparator.comparing(keyExtractorLikesFn).reversed())
                .forEach(System.out::println);

    }
}
