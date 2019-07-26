package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaUser;
import com.twu.biblioteca.Model.Role;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaUsers {
    static final ArrayList<BibliotecaUser> USERS = new ArrayList<>(Arrays.asList(
            new BibliotecaUser("Jack", "jack@gmail.com", "123456789", "password", Role.Customer),
            new BibliotecaUser("Bob", "bob@gmail.com", "123456788", "secret", Role.Customer),
            new BibliotecaUser("Max", "max@gmail.com", "123456787", "root", Role.Librarian)
    ));
}
