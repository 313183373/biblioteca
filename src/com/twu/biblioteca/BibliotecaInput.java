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

    int getUserSelection(BibliotecaMenu menu) {
        int selection;
        try {
            selection = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            bibliotecaView.showInvalidMenuOptionMessage();
            return INVALID_OPTION;
        }
        if (isValidMenuOption(selection, menu)) {
            return selection;
        }
        bibliotecaView.showInvalidMenuOptionMessage();
        return INVALID_OPTION;
    }

    private boolean isValidMenuOption(int selection, BibliotecaMenu menu) {
        return selection > 0 & selection <= menu.getAvailableItems().size();
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

    String getUserInputMovieName() {
        return scanner.nextLine();
    }
}
