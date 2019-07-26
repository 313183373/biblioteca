package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckoutBookTest {
    @Test
    public void ShouldCheckoutABookSucceed() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        BibliotecaLogin bibliotecaLogin = new BibliotecaLogin();
        BibliotecaBorrow bibliotecaBorrow = new BibliotecaBorrow(bibliotecaView, bibliotecaLogin);

        String bookTitle = BibliotecaBooks.BOOKS.get(0).getTitle();
        bibliotecaBorrow.borrowABook(bookTitle);
        assertThat(out.getContent(), is("Thank you! Enjoy the book"));
    }

    @Test
    public void ShouldCheckoutABookFail() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        BibliotecaLogin bibliotecaLogin = new BibliotecaLogin();
        BibliotecaBorrow bibliotecaBorrow = new BibliotecaBorrow(bibliotecaView, bibliotecaLogin);

        String bookTitle = "Wrong Title";
        bibliotecaBorrow.borrowABook(bookTitle);
        assertThat(out.getContent(), is("Sorry, that book is not available"));
    }
}
