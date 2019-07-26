package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaMenuItem;
import com.twu.biblioteca.Model.BibliotecaRole;

import java.util.ArrayList;

public class BibliotecaMenu {
    static final BibliotecaMenuItem[] ITEMS = {
            new BibliotecaMenuItem("List of books", BibliotecaRole.Customer, BibliotecaActions.ACTIONS.get(0)),
            new BibliotecaMenuItem("List of available movies", BibliotecaRole.Customer, BibliotecaActions.ACTIONS.get(1)),
            new BibliotecaMenuItem("Checkout a book", BibliotecaRole.Customer, BibliotecaActions.ACTIONS.get(2)),
            new BibliotecaMenuItem("Checkout a movie", BibliotecaRole.Customer, BibliotecaActions.ACTIONS.get(3)),
            new BibliotecaMenuItem("Return a book", BibliotecaRole.Customer, BibliotecaActions.ACTIONS.get(4)),
            new BibliotecaMenuItem("View books checked out", BibliotecaRole.Librarian, BibliotecaActions.ACTIONS.get(5)),
            new BibliotecaMenuItem("View my information", BibliotecaRole.Customer, BibliotecaActions.ACTIONS.get(6)),
            new BibliotecaMenuItem("Quit", BibliotecaRole.Customer, BibliotecaActions.ACTIONS.get(7))
    };

    private ArrayList<BibliotecaMenuItem> availableItems = new ArrayList<>();

    public ArrayList<BibliotecaMenuItem> getAvailableItems() {
        return availableItems;
    }

    public void addItem(BibliotecaMenuItem item) {
        availableItems.add(item);
    }
}
