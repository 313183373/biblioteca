package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaActions {
    static final ArrayList<BibliotecaAction> ACTIONS = new ArrayList<>(Arrays.asList(
            (view, borrow, input, login) -> view.showBookList(),
            (view, borrow, input, login) -> {
                view.showInputBookTitlePrompt();
                String title = input.getUserInputBookTitle();
                borrow.borrowABook(title);
            },
            (view, borrow, input, login) -> {
                view.showInputBookTitlePrompt();
                String title = input.getUserInputBookTitle();
                borrow.returnABook(title);
            },
            (view, borrow, input, login) -> view.showBooksCheckedOut(borrow),
            (view, borrow, input, login) -> {
               view.showUserInformation(login.getLoginUser());
            },
            (view, borrow, input, login) -> {
                System.exit(0);
            }
    ));
}
