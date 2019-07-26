package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaMovie;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaActions {
    static final ArrayList<BibliotecaAction> ACTIONS = new ArrayList<>(Arrays.asList(
            (view, borrow, input, login) -> view.showBookList(),
            (view, borrow, input, login) -> view.showMovieList(),
            (view, borrow, input, login) -> {
                view.showInputBookTitlePrompt();
                String title = input.getUserInputBookTitle();
                borrow.borrowABook(title);
            },
            (view, borrow, input, login) -> {
                view.showInputMovieNamePrompt();
                String name = input.getUserInputMovieName();
                BibliotecaMovie movie = BibliotecaMovies.getMovieByName(name);
                if (movie == null || !movie.isAvailable()) {
                    view.showBorrowMovieFail();
                } else {
                    movie.setAvailable(false);
                    view.showBorrowMovieSuccess();
                }
            },
            (view, borrow, input, login) -> {
                view.showInputBookTitlePrompt();
                String title = input.getUserInputBookTitle();
                borrow.returnABook(title);
            },
            (view, borrow, input, login) -> view.showBooksCheckedOut(borrow),
            (view, borrow, input, login) -> view.showUserInformation(login.getLoginUser()),
            (view, borrow, input, login) -> {
                throw new Error();
            }
    ));
}
