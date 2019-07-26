package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaMovie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BibliotecaMovies {
    static final ArrayList<BibliotecaMovie> MOVIE = new ArrayList<>(Arrays.asList(
            new BibliotecaMovie("Avengers:Endgame", "2019", "Anthony Russo, Joe Russo", 9),
            new BibliotecaMovie("Thor:Ragnarok", "2017", "Taika Waititi", 8),
            new BibliotecaMovie("Wonder Woman", "2017", "Patty Jenkins", 8),
            new BibliotecaMovie("Guardians of the Galaxy Vol. 2", "2017", "James Gunn", 8),
            new BibliotecaMovie("Logan", "2017", "James Mangold", 8),
            new BibliotecaMovie("Despicable Me 3", "2017", "Kyle Balda", 6),
            new BibliotecaMovie("Pirates of the Caribbean: Dead Men Tell No Tales", "2017", "Joachim Ronning, Espen Sandberg", 7),
            new BibliotecaMovie("Justice League", "2017", "Zack Snyder", 6),
            new BibliotecaMovie("Star Wars: Episode VIII - The Last Jedi", "2017", "Rian Johnson", 7),
            new BibliotecaMovie("Kong: Skull Island", "2017", "Jordan Vogt-Roberts", 7)
    ));

    static List<BibliotecaMovie> getAvailableMovies() {
        return MOVIE.stream().filter(BibliotecaMovie::isAvailable).collect(Collectors.toList());
    }

    static BibliotecaMovie getMovieByName(String name) {
        Optional<BibliotecaMovie> movieOptional = MOVIE.stream().filter(bibliotecaMovie -> bibliotecaMovie.getName().equals(name)).findFirst();
        return movieOptional.orElse(null);
    }
}
