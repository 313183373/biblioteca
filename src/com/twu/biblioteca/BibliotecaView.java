package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

class BibliotecaView {
    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    public static final String[] menu = {"List of books"};

    private PrintStream out;

    private BibliotecaBooks bibliotecaBooks;

    BibliotecaView(PrintStream out) {
        this.out = out;
        bibliotecaBooks = new BibliotecaBooks();
    }

    void welcome() {
        out.println(WELCOME);
    }

    void showMenu() {
        for (int i = 0; i < menu.length; i++) {
            int index = i + 1;
            out.println(index + ". " + menu[i]);
        }
    }

    public void showInvalidMenuOptionMessage() {
        out.println("Please select a valid option!");
    }

    public void showBookList() {
        ArrayList<BibliotecaBook> allBooks = bibliotecaBooks.getAllBooks();
        for (BibliotecaBook book : allBooks) {
            out.println(book.getTitle());
        }
    }
}
