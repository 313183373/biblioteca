package com.twu.biblioteca;

import com.twu.biblioteca.Model.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaView {
    private static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    private static final String INVALID_OPTION_MESSAGE = "Please select a valid option!";
    private static final String BOOK_LIST_DIVIDING_LINE = "----------------------------------------------------------------";
    private static final String BORROW_RECORDS_DIVIDING_LINE = "-----------------------------------------";
    private static final String LIST_OF_ALL_BOOKS_START = String.format("%-30s|%25s|%s\n%s", "Title", "Author", "Publish", BOOK_LIST_DIVIDING_LINE);
    private static final String INPUT_TITLE_PROMPT = "Please enter the book title: ";
    private static final String CHECKOUT_SUCCEED_MESSAGE = "Thank you! Enjoy the book";
    private static final String CHECKOUT_FAIL_MESSAGE = "Sorry, that book is not available";
    private static final String RETURN_BOOK_SUCCEED_MESSAGE = "Thank you for returning the book";
    private static final String RETURN_BOOK_FAIL = "That is not a valid book to return.";
    private static final String LOGIN_PROMPT = "Please login first";
    private static final String BORROW_RECORDS_LIST_START = String.format("%-30s|%10s", "Book Title", "Customer");
    private static final String NO_BOOK_CHECKED_OUT = "There is no book checked out";
    private static final String LOGIN_FAILE_MESSAGE = "Sorry, invalid user, please try again!";

    private PrintStream out;

    BibliotecaView(PrintStream out) {
        this.out = out;
    }

    void welcome() {
        out.println(WELCOME);
    }

    void showMenu(BibliotecaMenu bibliotecaMenu) {
        ArrayList<BibliotecaMenuItem> availableItems = bibliotecaMenu.getAvailableItems();
        for (int i = 0; i < availableItems.size(); i++) {
            int index = i + 1;
            out.println(index + ": " + availableItems.get(i).getName());
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

    void showBooksCheckedOut(BibliotecaBorrow borrow) {
        ArrayList<BibliotecaBorrowRecord> allRecords = borrow.getBorrowRecords();
        if (allRecords.size() <= 0) {
            out.println(NO_BOOK_CHECKED_OUT);
            return;
        }
        out.println(BORROW_RECORDS_LIST_START);
        out.println(BORROW_RECORDS_DIVIDING_LINE);
        for (BibliotecaBorrowRecord record : allRecords) {
            out.println(record.toString());
        }
    }

    void showLoginFailPrompt() {
        out.println(LOGIN_FAILE_MESSAGE);
    }

    void showUserInformation(BibliotecaUser loginUser) {
        out.println("name: " + loginUser.getName());
        out.println("email: " + loginUser.getEmail());
        out.println("phone number: " + loginUser.getPhoneNumber());
    }

    void showMovieList() {
        List<BibliotecaMovie> availableMovies = BibliotecaMovies.getAvailableMovies();
        for (BibliotecaMovie movie : availableMovies) {
            out.println(movie.toString());
        }
    }
}
