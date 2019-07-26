package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    private BibliotecaView view;
    private BibliotecaInput input;
    private BibliotecaBorrow borrow;

    BibliotecaApp(BibliotecaView bibliotecaView, BibliotecaInput bibliotecaInput, BibliotecaBorrow bibliotecaBorrow) {
        view = bibliotecaView;
        input = bibliotecaInput;
        borrow = bibliotecaBorrow;
    }

    private BibliotecaApp() {
        this.view = new BibliotecaView(System.out);
        this.input = new BibliotecaInput(view, new Scanner(System.in));
        this.borrow = new BibliotecaBorrow(view);
    }

    void launch() {
        view.welcome();
        while (true) {
            view.showMenu();
            int selection = input.getUserSelection();
            if (selection == 4) {
                break;
            }
            switch (selection) {
                case 1: {
                    view.showBookList();
                    break;
                }
                case 2: {
                    view.showInputBookTitlePrompt();
                    String title = input.getUserInputBookTitle();
                    borrow.borrowABook(title);
                    break;
                }
                case 3: {
                    view.showInputBookTitlePrompt();
                    String title = input.getUserInputBookTitle();
                    borrow.returnABook(title);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new BibliotecaApp().launch();
    }
}
