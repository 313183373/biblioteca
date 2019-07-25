package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaBooks {
    public static final ArrayList<BibliotecaBook> books = new ArrayList<>(Arrays.asList(new BibliotecaBook("In Search of Lost Time", "Marcel Proust", "1998"),
            new BibliotecaBook("Don Quixote", "Miguel de Cervantes", "1999"),
            new BibliotecaBook("Ulysses", "James Joyce", "1997"),
            new BibliotecaBook("The Great Gatsby", "F.Scott Fitzgerald", "1987"),
            new BibliotecaBook("Moby Dick", "Herman Melville", "1980"),
            new BibliotecaBook("Hamlet", "William Shakespeare", "2000"),
            new BibliotecaBook("War and Peace", "Leo Tolstoy", "2001"),
            new BibliotecaBook("The Odyssey", "Homer", "1993"),
            new BibliotecaBook("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "2000"),
            new BibliotecaBook("The Divine Comedy", "Dante Alighieri", "2001")));
}
