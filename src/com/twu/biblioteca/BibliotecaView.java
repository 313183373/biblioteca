package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaBook;
import com.twu.biblioteca.Model.BibliotecaUser;

import java.io.PrintStream;

class BibliotecaView {
    static final String[] MENU = {"List of BOOKS", "Checkout a book", "Return a book", "Quit"};

    private static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    private static final String INVALID_OPTION_MESSAGE = "Please select a valid option!";
    private static final String DIVIDING_LINE = "----------------------------------------------------------------";
    private static final String LIST_OF_ALL_BOOKS_START = String.format("%-30s|%25s|%s\n%s", "Title", "Author", "Publish", DIVIDING_LINE);
    private static final String INPUT_TITLE_PROMPT = "Please enter the book title: ";
    private static final String CHECKOUT_SUCCEED_MESSAGE = "Thank you! Enjoy the book";
    private static final String CHECKOUT_FAIL_MESSAGE = "Sorry, that book is not available";
    private static final String RETURN_BOOK_SUCCEED_MESSAGE = "Thank you for returning the book";
    private static final String RETURN_BOOK_FAIL = "That is not a valid book to return.";
    public static final String LOGIN_PROMPT = "Please login first";

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

    void showInvalidMenuOptionMessage() {
        out.println(INVALID_OPTION_MESSAGE);
    }

    void showInputBookTitlePrompt() {
        out.println(INPUT_TITLE_PROMPT);
    }

    void showBookList() {
        out.println(LIST_OF_ALL_BOOKS_START);
        for (BibliotecaBook book : BibliotecaBooks.BOOKS) {
            out.println(book.toString());
        }
    }

    void showCheckoutSucceedMessage() {
        out.println(CHECKOUT_SUCCEED_MESSAGE);
    }

    void showCheckoutFailMessage() {
        out.println(CHECKOUT_FAIL_MESSAGE);
    }

    void showReturnBookSucceedMessage() {
        out.println(RETURN_BOOK_SUCCEED_MESSAGE);
    }

    void showReturnBookFailMessage() {
        out.println(RETURN_BOOK_FAIL);
    }

    void showLoginPrompt() {
        out.println(LOGIN_PROMPT);
    }

    void showNameRequest() {
        out.println("Name:");
    }

    void showPasswordRequest() {
        out.println("Password:");
    }

    void showWelcomeUser(BibliotecaUser user) {
        out.println("Hello " + user.getName());
    }
}
