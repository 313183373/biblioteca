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
        assertThat(printStreamSpy.getContent(), is("In Search of Lost Time\nDon Quixote\nUlysses\nThe Great Gatsby\nMoby Dick\nHamlet\nWar and Peace\nThe Odyssey\nOne Hundred Years of Solitude\nThe Divine Comedy"));
    }
}
