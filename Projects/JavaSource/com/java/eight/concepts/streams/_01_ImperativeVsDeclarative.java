package com.java.eight.concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _01_ImperativeVsDeclarative {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Don", 15),
                new Movie("KGF", 45),
                new Movie("RRR", 43),
                new Movie("Sholay", 43),
                new Movie("Bahubali", 34),
                new Movie("Googly", 67),
                new Movie("DDLJ", 56),
                new Movie("Runway34", 23)
        );

        //Imperative programming -> How
        int moreLikes = 0;
        int moreThan25Likes = 0;
        for (Movie movie : movies) {
            if (movie.getLikes() > moreLikes) {
                moreLikes = movie.getLikes();
            }

            if (movie.getLikes() > 25) {
                moreThan25Likes++;
            }
        }

        System.out.println("Movie with maximum likes : " + moreLikes);
        System.out.println("Movie with moreThan25Likes: " + moreThan25Likes);

        //Declarative -> What


//        long moviesWith25PlusLikes = movieStream.filter(moreThan25LikesPred).count();
//        System.out.println("Movie with moviesWith25PlusLikes: " + moviesWith25PlusLikes);


        Predicate<Movie> moreThan25LikesPred = movie -> movie.getLikes() > 25;
        Function<Movie, String> getNameOfTheMovie = movie -> movie.getName();
        //Stream Pipeline Example!
        Stream<Movie> movieStream = movies.stream(); //Source
        List<String> moviesList = movieStream
                .filter(moreThan25LikesPred) // Predicate (Functional Interface) -> Intermediate Operation 1
                .map(getNameOfTheMovie) //Function (Functional Interface)  -> Intermediate Operation 2
                .limit(3) // -> Intermediate Operation 3
                .collect(Collectors.toList()); // -> Terminal Operation 2



        System.out.println("moviesList with greater than 25 likes " + moviesList);
    }

    static class Movie {
        private String name;
        private int likes;

        public Movie(String name, int likes) {
            this.name = name;
            this.likes = likes;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }
    }


}
