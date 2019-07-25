package com.twu.biblioteca;

import java.io.PrintStream;

class BibliotecaView {
    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    public static final String[] menu = {"List of books"};

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
}
