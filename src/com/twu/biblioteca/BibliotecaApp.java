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
        this.login = new BibliotecaLogin();
        this.borrow = new BibliotecaBorrow(view, login);
    }

    void launch() {
        view.welcome();
        view.showLoginPrompt();
        login();
        while (true) {
            BibliotecaMenu availableMenu = login.getAvailableMenu();
            view.showMenu(availableMenu);
            int selection = input.getUserSelection() - 1;
            availableMenu.getAvailableItems().get(selection).handle(view, borrow, input, login);
        }
    }

    private void login() {
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
            view.showLoginFailPrompt();
        }
    }

    public static void main(String[] args) {
        new BibliotecaApp().launch();
    }
}
