package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaUser;

import java.util.Scanner;

public class BibliotecaApp {

    private BibliotecaView view;
    private BibliotecaInput input;
    private BibliotecaBorrow borrow;
    private BibliotecaLogin login;

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
        view.showLoginPrompt();
        while (true) {
            view.showNameRequest();
            String name = input.getUserName();
            view.showPasswordRequest();
            String password = input.getUserPassword();
            BibliotecaUser loginUser = login.login(name, password);
            if (loginUser != null) {
                view.showWelcomeUser(loginUser);
                break;
            }
        }
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
