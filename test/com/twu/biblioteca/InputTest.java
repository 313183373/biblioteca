package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import java.util.Scanner;

import static com.twu.biblioteca.BibliotecaInput.INVALID_OPTION;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InputTest {

    @Test
    public void ShouldGetNotifiedWhenChooseAnInvalidOption() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        BibliotecaInput bibliotecaInput = new BibliotecaInput(bibliotecaView, new Scanner("3\n"));

        int selection = bibliotecaInput.getUserSelection();

        assertThat(out.getContent(), is("Please select a valid option!"));
        assertThat(selection, is(INVALID_OPTION));
    }
}
