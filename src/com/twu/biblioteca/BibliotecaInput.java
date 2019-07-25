package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaInput {
    public static final int INVALID_OPTION = -1;
    private BibliotecaView bibliotecaView;
    private Scanner scanner;

    public BibliotecaInput(BibliotecaView bibliotecaView, Scanner scanner) {
        this.bibliotecaView = bibliotecaView;
        this.scanner = scanner;
    }

    public int getUserSelection() {
        int selection;
        try {
            selection = scanner.nextInt();
        } catch (Exception e) {
            bibliotecaView.showInvalidMenuOptionMessage();
            scanner.nextLine();
            return INVALID_OPTION;
        }
        scanner.nextLine();
        if (isValidMenuOption(selection)) {
            return selection;
        }
        bibliotecaView.showInvalidMenuOptionMessage();
        return INVALID_OPTION;
    }

    private boolean isValidMenuOption(int selection) {
        return selection > 0 & selection <= BibliotecaView.MENU.length;
    }

    public String getUserInputBookTitle() {
        return scanner.nextLine();
    }
}
