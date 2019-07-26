package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaBook;
import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ViewBooksCheckedOutTest {
    @Test
    public void ShouldViewBooksCheckedOut() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView view = new BibliotecaView(out);
        BibliotecaLogin login = new BibliotecaLogin();
        BibliotecaBorrow borrow = new BibliotecaBorrow(view, login);

        login.login("Jack", "password");
        ArrayList<BibliotecaBook> books = BibliotecaBooks.BOOKS;
        borrow.borrowABook(books.get(0).getTitle());
        borrow.borrowABook(books.get(1).getTitle());
        borrow.borrowABook(books.get(2).getTitle());
        login.login("Bob", "secret");
        borrow.borrowABook(books.get(3).getTitle());
        out.clearContent();

        view.showBooksCheckedOut(borrow);

        assertThat(out.getContent(), is("" +
                "Book Title                    |  Customer\n" +
                "-----------------------------------------\n" +
                "In Search of Lost Time        |      Jack\n" +
                "Don Quixote                   |      Jack\n" +
                "Ulysses                       |      Jack\n" +
                "The Great Gatsby              |       Bob"));
    }

    @Test
    public void ShouldViewAMessageWhenNoBookCheckedOut() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView view = new BibliotecaView(out);
        BibliotecaLogin login = new BibliotecaLogin();
        BibliotecaBorrow borrow = new BibliotecaBorrow(view, login);

        view.showBooksCheckedOut(borrow);

        assertThat(out.getContent(), is("There is no book checked out"));
    }
}
