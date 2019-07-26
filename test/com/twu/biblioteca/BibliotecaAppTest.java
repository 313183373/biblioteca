package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
                new Scanner("1\n2\nDon Quixote\n3\nDon Quixote\n4\n"));
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaView, bibliotecaInput, bibliotecaBorrow);

        bibliotecaApp.launch();

        assertThat(out.getContent(), is(
                "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n" +
                        "1. List of BOOKS\n" +
                        "2. Checkout a book\n" +
                        "3. Return a book\n" +
                        "4. Quit\n" +
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
                        "1. List of BOOKS\n" +
                        "2. Checkout a book\n" +
                        "3. Return a book\n" +
                        "4. Quit\n" +
                        "Please enter the book title: \n" +
                        "Thank you! Enjoy the book\n" +
                        "1. List of BOOKS\n" +
                        "2. Checkout a book\n" +
                        "3. Return a book\n" +
                        "4. Quit\n" +
                        "Please enter the book title: \n" +
                        "Thank you for returning the book\n" +
                        "1. List of BOOKS\n" +
                        "2. Checkout a book\n" +
                        "3. Return a book\n" +
                        "4. Quit"));
    }
}
