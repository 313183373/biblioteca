package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaMenuItem;
import com.twu.biblioteca.Model.BibliotecaRole;

import java.util.ArrayList;

public class BibliotecaMenu {
    static final BibliotecaMenuItem[] ITEMS = {
            new BibliotecaMenuItem("List of books", BibliotecaRole.Customer, BibliotecaActions.actions.get(0)),
            new BibliotecaMenuItem("Checkout a book", BibliotecaRole.Customer, BibliotecaActions.actions.get(1)),
            new BibliotecaMenuItem("Return a book", BibliotecaRole.Customer, BibliotecaActions.actions.get(2)),
            new BibliotecaMenuItem("View books checked out", BibliotecaRole.Librarian, BibliotecaActions.actions.get(3)),
            new BibliotecaMenuItem("Quit", BibliotecaRole.Customer, BibliotecaActions.actions.get(4))
    };

    private ArrayList<BibliotecaMenuItem> availableItems = new ArrayList<>();

    public ArrayList<BibliotecaMenuItem> getAvailableItems() {
        return availableItems;
    }

    public void addItem(BibliotecaMenuItem item) {
        availableItems.add(item);
    }
}
