package com.twu.biblioteca;

import com.twu.biblioteca.Model.BibliotecaUser;

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
}
