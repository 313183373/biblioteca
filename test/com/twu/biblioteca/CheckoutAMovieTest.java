package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaMovie;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckoutAMovieTest {
    @Test
    public void ShouldCheckoutAMovie() {
        BibliotecaMovie movie = BibliotecaMovies.getMovieByName("Justice League");

        movie.setAvailable(false);

        assertThat(movie.isAvailable(), is(false));
        movie.setAvailable(true);
    }
}
