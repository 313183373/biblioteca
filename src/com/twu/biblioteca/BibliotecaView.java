package com.twu.biblioteca;

import java.io.PrintStream;

class BibliotecaView {
    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    public static final String INVALID_OPTION_MESSAGE = "Please select a valid option!";
    public static final String DIVIDING_LINE = "----------------------------------------------------------------";
    public static final String LIST_OF_ALL_BOOKS_START = String.format("%-30s|%25s|%s\n%s", "Title", "Author", "Publish", DIVIDING_LINE);

    public static final String[] MENU = {"List of BOOKS", "Checkout a book", "Return a book", "Quit"};
    public static final String INPUT_TITLE_PROMPT = "Please enter the book title: ";
    public static final String CHECKOUT_SUCCEED_MESSAGE = "Thank you! Enjoy the book";
    public static final String CHECKOUT_FAIL_MESSAGE = "Sorry, that book is not available";
    public static final String RETURN_BOOK_SUCCEED_MESSAGE = "Thank you for returning the book";
    public static final String RETURN_BOOK_FAIL = "That is not a valid book to return.";

    private PrintStream out;

    BibliotecaView(PrintStream out) {
        this.out = out;
    }

    void welcome() {
        out.println(WELCOME);
    }

    void showMenu() {
        for (int i = 0; i < MENU.length; i++) {
            int index = i + 1;
            out.println(index + ". " + MENU[i]);
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
        for (BibliotecaBook book : BibliotecaBooks.BOOKS) {
            out.println(book.toString());
        }
    }

    public void showCheckoutSucceedMessage() {
        out.println(CHECKOUT_SUCCEED_MESSAGE);
    }

    public void showCheckoutFailMessage() {
        out.println(CHECKOUT_FAIL_MESSAGE);
    }

    public void showReturnBookSucceedMessage() {
        out.println(RETURN_BOOK_SUCCEED_MESSAGE);
    }

    public void showReturnBookFailMessage() {
        out.println(RETURN_BOOK_FAIL);
    }
}
