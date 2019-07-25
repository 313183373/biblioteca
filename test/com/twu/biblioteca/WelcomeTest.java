package com.twu.biblioteca;


import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WelcomeTest {

    @Test
    public void ShouldReturnAWelcomeMessageWhenCallWelcome() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        bibliotecaView.welcome();
        assertThat(out.getContent(), is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!"));
    }

}
