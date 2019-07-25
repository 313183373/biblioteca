package com.twu.biblioteca;

import java.util.Scanner;

import static com.twu.biblioteca.BibliotecaInput.INVALID_OPTION;

public class BibliotecaApp {

    private BibliotecaView view;
    private BibliotecaInput input;

    public BibliotecaApp(BibliotecaView view) {
        this.view = view;
    }

    public BibliotecaApp() {
        this.view = new BibliotecaView(System.out);
        this.input = new BibliotecaInput(view, new Scanner(System.in));
    }

    private void launch() {
        view.welcome();
        view.showMenu();
        int selection = input.getUserSelection();
        switch (selection) {
            case 1:
                view.showBookList();
                break;
        }
    }

    public static void main(String[] args) {
        new BibliotecaApp().launch();
    }
}
