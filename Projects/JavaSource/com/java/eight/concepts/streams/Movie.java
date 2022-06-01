package com.java.eight.concepts.streams;

import java.util.Objects;

enum Genre {
    COMEDY, ACTION, THRILLER;
}

public class Movie {

    private String title;
    private int likes;
    private Genre genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Movie(String title, int likes) {

        this.title = title;
        this.likes = likes;
    }  public Movie(String title, int likes, Genre genre) {

        this.title = title;
        this.genre = genre;
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return likes == movie.likes &&
                Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, likes);
    }
}
