package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MenuTest {

    @Test
    public void ShouldPrintMenuListOfOptionsWhenCurrentUserIsCustomer() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        BibliotecaLogin bibliotecaLogin = new BibliotecaLogin();
        bibliotecaLogin.login("Jack", "password");
        bibliotecaView.showMenu(bibliotecaLogin.getAvailableMenu());
        assertThat(out.getContent(), is("" +
                "1: List of books\n" +
                "2: List of available movies\n" +
                "3: Checkout a book\n" +
                "4: Checkout a movie\n" +
                "5: Return a book\n" +
                "6: View my information\n" +
                "7: Quit"));
    }

    @Test
    public void ShouldPrintMenuListOfOptionsWhenCurrentUserIsLibrarian() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        BibliotecaLogin bibliotecaLogin = new BibliotecaLogin();
        bibliotecaLogin.login("Max", "root");
        bibliotecaView.showMenu(bibliotecaLogin.getAvailableMenu());
        assertThat(out.getContent(), is("" +
                "1: List of books\n" +
                "2: List of available movies\n" +
                "3: Checkout a book\n" +
                "4: Checkout a movie\n" +
                "5: Return a book\n" +
                "6: View books checked out\n" +
                "7: View my information\n" +
                "8: Quit"));
    }
}
