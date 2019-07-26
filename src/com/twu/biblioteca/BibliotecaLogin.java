package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaMenuItem;
import com.twu.biblioteca.Model.BibliotecaUser;
import com.twu.biblioteca.Model.BibliotecaRole;

public class BibliotecaLogin {

    private BibliotecaUser loginUser;

    public BibliotecaUser login(String name, String password) {
        for (BibliotecaUser user : BibliotecaUsers.USERS) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                loginUser = user;
                return user;
            }
        }
        return null;
    }

    public BibliotecaUser getLoginUser() {
        return loginUser;
    }

    public BibliotecaMenu getAvailableMenu() {
        BibliotecaMenu bibliotecaMenu = new BibliotecaMenu();
        for (BibliotecaMenuItem item : BibliotecaMenu.ITEMS) {
            if (hasRight(loginUser, item)) {
                bibliotecaMenu.addItem(item);
            }
        }
        return bibliotecaMenu;
    }

    private boolean hasRight(BibliotecaUser loginUser, BibliotecaMenuItem item) {
        return loginUser.getBibliotecaRole() == BibliotecaRole.Librarian || loginUser.getBibliotecaRole() == item.getBibliotecaRole();
    }
}
