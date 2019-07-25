package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReturnBookTest {
    @Test
    public void ShouldReturnABookSucceed() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        BibliotecaBorrow bibliotecaBorrow = new BibliotecaBorrow(bibliotecaView);

        String bookTitle = BibliotecaBooks.books.get(0).getTitle();
        bibliotecaBorrow.borrowABook(bookTitle);
        bibliotecaBorrow.returnABook(bookTitle);
        assertThat(out.getContent(), is("Thank you! Enjoy the book\nThank you for returning the book"));

    }
}