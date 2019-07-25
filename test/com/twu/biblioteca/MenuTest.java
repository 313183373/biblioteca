package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MenuTest {

    @Test
    public void ShouldPrintMenuListOfOptions() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        bibliotecaView.showMenu();
        assertThat(out.getContent(), is("1. List of books\n2. Checkout a book"));
    }
}
