package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {
    @Test
    public void ShouldLoginSuccessfully() {
        BibliotecaLogin bibliotecaLogin = new BibliotecaLogin();
        bibliotecaLogin.login("Jack", "password");
        assertThat(bibliotecaLogin.getLoginUser(), is(notNullValue()));
        assertThat(bibliotecaLogin.getLoginUser().getName(), is("Jack"));
    }

    @Test
    public void ShouldLoginFail() {
        BibliotecaLogin bibliotecaLogin = new BibliotecaLogin();
        bibliotecaLogin.login("Jack", "wrong passwrod");
        assertThat(bibliotecaLogin.getLoginUser(), is(nullValue()));
    }
}
