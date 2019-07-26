package com.twu.biblioteca.Model;

public class BibliotecaMovie {
    private String name;
    private String year;
    private String director;
    private int movieRating;
    private boolean isAvailable;

    public BibliotecaMovie(String name, String year, String director, int movieRating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return String.format("%-50s|%4s|%32s|%2d", name, year, director, movieRating);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getName() {
        return name;
    }
}
