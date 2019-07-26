package com.twu.biblioteca.Model;

public class BibliotecaMovie {
    private String name;
    private String year;
    private String director;
    private int movieRating;

    public BibliotecaMovie(String name, String year, String director, int movieRating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }
}
