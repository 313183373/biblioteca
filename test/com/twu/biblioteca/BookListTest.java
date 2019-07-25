package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookListTest {
    @Test
    public void ShouldViewAListOfBooks() {
        PrintStreamSpy printStreamSpy = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(printStreamSpy);
        bibliotecaView.showBookList();
        assertThat(printStreamSpy.getContent(), is(
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
                        "The Divine Comedy             |          Dante Alighieri|   2001"));
    }
}
