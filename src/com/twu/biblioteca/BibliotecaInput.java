package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaInput {
    static final int INVALID_OPTION = -1;
    private BibliotecaView bibliotecaView;
    private Scanner scanner;

    BibliotecaInput(BibliotecaView bibliotecaView, Scanner scanner) {
        this.bibliotecaView = bibliotecaView;
        this.scanner = scanner;
    }

    int getUserSelection() {
        int selection;
        try {
            selection = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            bibliotecaView.showInvalidMenuOptionMessage();
            return INVALID_OPTION;
        }
        if (isValidMenuOption(selection)) {
            return selection;
        }
        bibliotecaView.showInvalidMenuOptionMessage();
        return INVALID_OPTION;
    }

    private boolean isValidMenuOption(int selection) {
        return selection > 0 & selection <= BibliotecaMenu.ITEMS.length;
    }

    String getUserInputBookTitle() {
        return scanner.nextLine();
    }

    String getUserName() {
        return scanner.nextLine();
    }

    String getUserPassword() {
        return scanner.nextLine();
    }
}
