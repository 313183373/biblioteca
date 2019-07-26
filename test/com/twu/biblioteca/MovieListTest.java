package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieListTest {
    @Test
    public void ShouldViewAListOfMovies() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        bibliotecaView.showMovieList();

        assertThat(out.getContent(), is("" +
                "Avengers:Endgame                                  |2019|        Anthony Russo, Joe Russo| 9\n" +
                "Thor:Ragnarok                                     |2017|                   Taika Waititi| 8\n" +
                "Wonder Woman                                      |2017|                   Patty Jenkins| 8\n" +
                "Guardians of the Galaxy Vol. 2                    |2017|                      James Gunn| 8\n" +
                "Logan                                             |2017|                   James Mangold| 8\n" +
                "Despicable Me 3                                   |2017|                      Kyle Balda| 6\n" +
                "Pirates of the Caribbean: Dead Men Tell No Tales  |2017| Joachim Ronning, Espen Sandberg| 7\n" +
                "Justice League                                    |2017|                     Zack Snyder| 6\n" +
                "Star Wars: Episode VIII - The Last Jedi           |2017|                    Rian Johnson| 7\n" +
                "Kong: Skull Island                                |2017|             Jordan Vogt-Roberts| 7"));
    }
}
