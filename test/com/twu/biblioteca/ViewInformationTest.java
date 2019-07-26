package com.twu.biblioteca;

import com.twu.biblioteca.TestDouble.DummyOutputStream;
import com.twu.biblioteca.TestDouble.PrintStreamSpy;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ViewInformationTest {
    @Test
    public void ShouldDisplayUserInformation() {
        PrintStreamSpy out = new PrintStreamSpy(new DummyOutputStream());
        BibliotecaView bibliotecaView = new BibliotecaView(out);
        BibliotecaLogin bibliotecaLogin = new BibliotecaLogin();
        bibliotecaLogin.login("Jack", "password");

        bibliotecaView.showUserInformation(bibliotecaLogin.getLoginUser());

        assertThat(out.getContent(), is(
                "name: Jack\n" +
                        "email: jack@gmail.com\n" +
                        "phone number: 123456789"));
    }
}
