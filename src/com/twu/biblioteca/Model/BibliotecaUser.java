package com.twu.biblioteca.Model;

public class BibliotecaUser {
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private BibliotecaRole bibliotecaRole;

    public BibliotecaUser(String name, String email, String phoneNumber, String password, BibliotecaRole bibliotecaRole) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.bibliotecaRole = bibliotecaRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BibliotecaRole getBibliotecaRole() {
        return bibliotecaRole;
    }

    public void setBibliotecaRole(BibliotecaRole bibliotecaRole) {
        this.bibliotecaRole = bibliotecaRole;
    }

    public boolean isLibrarian() {
        return bibliotecaRole.equals(BibliotecaRole.Librarian);
    }
}
