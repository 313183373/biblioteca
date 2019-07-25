package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaBooks {
    private ArrayList<BibliotecaBook> books = new ArrayList<>(Arrays.asList(BOOKS));

    public final static BibliotecaBook[] BOOKS = {
            new BibliotecaBook("In Search of Lost Time"),
            new BibliotecaBook("Don Quixote"),
            new BibliotecaBook("Ulysses"),
            new BibliotecaBook("The Great Gatsby"),
            new BibliotecaBook("Moby Dick"),
            new BibliotecaBook("Hamlet"),
            new BibliotecaBook("War and Peace"),
            new BibliotecaBook("The Odyssey"),
            new BibliotecaBook("One Hundred Years of Solitude"),
            new BibliotecaBook("The Divine Comedy"),
    };

    public ArrayList<BibliotecaBook> getAllBooks() {
        return books;
    }
}
