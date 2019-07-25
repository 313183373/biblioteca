package com.twu.biblioteca;

import java.io.PrintStream;

class BibliotecaView {
    private PrintStream out;

    BibliotecaView(PrintStream out) {
        this.out = out;
    }

    void welcome() {
        out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}
