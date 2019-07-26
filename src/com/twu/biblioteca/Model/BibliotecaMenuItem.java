package com.twu.biblioteca.Model;

import com.twu.biblioteca.*;

public class BibliotecaMenuItem {
    private String name;
    private BibliotecaRole bibliotecaRole;
    private BibliotecaAction action;

    public BibliotecaMenuItem(String name, BibliotecaRole bibliotecaRole, BibliotecaAction action) {
        this.name = name;
        this.bibliotecaRole = bibliotecaRole;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public BibliotecaRole getBibliotecaRole() {
        return bibliotecaRole;
    }

    public void handle(BibliotecaView view, BibliotecaBorrow borrow, BibliotecaInput input, BibliotecaLogin login) {
        action.handle(view, borrow, input, login);
    }
}
