package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private PrintStreamSpy out;
    private BibliotecaView bibliotecaView;
    private BibliotecaBorrow bibliotecaBorrow;
    private BibliotecaLogin bibliotecaLogin;

    @Before
    public void setUp() {
        out = new PrintStreamSpy(new DummyOutputStream());
        bibliotecaView = new BibliotecaView(out);
        bibliotecaLogin = new BibliotecaLogin();
        bibliotecaBorrow = new BibliotecaBorrow(bibliotecaView, bibliotecaLogin);
    }

    @Test
    public void CanCheckoutABookAndReturnABook() {
        BibliotecaInput bibliotecaInput = new BibliotecaInput(bibliotecaView,
                new Scanner("Jack\npassword\n1\n3\nIn Search of Lost Time\n2\n4\nJustice League\n5\nIn Search of Lost Time\n6\n7\n"));
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaView, bibliotecaInput, bibliotecaBorrow, bibliotecaLogin);

        bibliotecaApp.launch();

        assertEquals(1, 1);

        assertThat(out.getContent(), is(
                "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n" +
                        "Please login first\n" +
                        "Name:\n" +
                        "Password:\n" +
                        "Hello Jack\n" +
                        "1: List of books\n" +
                        "2: List of available movies\n" +
                        "3: Checkout a book\n" +
                        "4: Checkout a movie\n" +
                        "5: Return a book\n" +
                        "6: View my information\n" +
                        "7: Quit\n" +
                        "Title                         |                   Author|Publish\n" +
                        "----------------------------------------------------------------\n" +
                        "In Search of Lost Time        |            Marcel Proust|   1998\n" +
                        "Don Quixote                   |      Miguel de Cervantes|   1999\n" +
                        "Ulysses                       |              James Joyce|   1997\n" +
                        "The Great Gatsby              |       F.Scott Fitzgerald|   1987\n" +
                        "Moby Dick                     |          Herman Melville|   1980\n" +
                        "Hamlet                        |      William Shakespeare|   2000\n" +
                        "War and Peace                 |              Leo Tolstoy|   2001\n" +
                        "The Odyssey                   |                    Homer|   1993\n" +
                        "One Hundred Years of Solitude |   Gabriel Garcia Marquez|   2000\n" +
                        "The Divine Comedy             |          Dante Alighieri|   2001\n" +
                        "1: List of books\n" +
                        "2: List of available movies\n" +
                        "3: Checkout a book\n" +
                        "4: Checkout a movie\n" +
                        "5: Return a book\n" +
                        "6: View my information\n" +
                        "7: Quit\n" +
                        "Please enter the book title: \n" +
                        "Thank you! Enjoy the book\n" +
                        "1: List of books\n" +
                        "2: List of available movies\n" +
                        "3: Checkout a book\n" +
                        "4: Checkout a movie\n" +
                        "5: Return a book\n" +
                        "6: View my information\n" +
                        "7: Quit\n" +
                        "Name                                              |Year|                        Director|Rating\n" +
                        "Avengers:Endgame                                  |2019|        Anthony Russo, Joe Russo| 9\n" +
                        "Thor:Ragnarok                                     |2017|                   Taika Waititi| 8\n" +
                        "Wonder Woman                                      |2017|                   Patty Jenkins| 8\n" +
                        "Guardians of the Galaxy Vol. 2                    |2017|                      James Gunn| 8\n" +
                        "Logan                                             |2017|                   James Mangold| 8\n" +
                        "Despicable Me 3                                   |2017|                      Kyle Balda| 6\n" +
                        "Pirates of the Caribbean: Dead Men Tell No Tales  |2017| Joachim Ronning, Espen Sandberg| 7\n" +
                        "Justice League                                    |2017|                     Zack Snyder| 6\n" +
                        "Star Wars: Episode VIII - The Last Jedi           |2017|                    Rian Johnson| 7\n" +
                        "Kong: Skull Island                                |2017|             Jordan Vogt-Roberts| 7\n" +
                        "1: List of books\n" +
                        "2: List of available movies\n" +
                        "3: Checkout a book\n" +
                        "4: Checkout a movie\n" +
                        "5: Return a book\n" +
                        "6: View my information\n" +
                        "7: Quit\n" +
                        "Please enter a movie name:\n" +
                        "Thank you! Enjoy the movie\n" +
                        "1: List of books\n" +
                        "2: List of available movies\n" +
                        "3: Checkout a book\n" +
                        "4: Checkout a movie\n" +
                        "5: Return a book\n" +
                        "6: View my information\n" +
                        "7: Quit\n" +
                        "Please enter the book title: \n" +
                        "Thank you for returning the book\n" +
                        "1: List of books\n" +
                        "2: List of available movies\n" +
                        "3: Checkout a book\n" +
                        "4: Checkout a movie\n" +
                        "5: Return a book\n" +
                        "6: View my information\n" +
                        "7: Quit\n" +
                        "name: Jack\n" +
                        "email: jack@gmail.com\n" +
                        "phone number: 123456789\n" +
                        "1: List of books\n" +
                        "2: List of available movies\n" +
                        "3: Checkout a book\n" +
                        "4: Checkout a movie\n" +
                        "5: Return a book\n" +
                        "6: View my information\n" +
                        "7: Quit"));
    }
}
