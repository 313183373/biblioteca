package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

class BibliotecaView {
    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    public static final String INVALID_OPTION_MESSAGE = "Please select a valid option!";
    public static final String DIVIDING_LINE = "----------------------------------------------------------------";
    public static final String LIST_OF_ALL_BOOKS_START = String.format("%-30s|%25s|%s\n%s", "Title", "Author", "Publish", DIVIDING_LINE);

    public static final String[] menu = {"List of books", "Checkout a book"};
    public static final String INPUT_TITLE_PROMPT = "Please enter the book title: ";

    private PrintStream out;

    BibliotecaView(PrintStream out) {
        this.out = out;
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
        out.println(INVALID_OPTION_MESSAGE);
    }

    public void showInputBookTitlePrompt() {
        out.println(INPUT_TITLE_PROMPT);
    }

    public void showBookList() {
        out.println(LIST_OF_ALL_BOOKS_START);
        for (BibliotecaBook book : BibliotecaBooks.books) {
            out.println(book.toString());
        }
    }
}
