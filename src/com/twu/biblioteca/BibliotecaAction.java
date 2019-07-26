package com.twu.biblioteca;

public interface BibliotecaAction {
    public void handle(BibliotecaView view, BibliotecaBorrow borrow, BibliotecaInput input, BibliotecaLogin login);
}
