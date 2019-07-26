package com.twu.biblioteca.Model;

public class BibliotecaBorrowRecord {
    private String bookTitle;
    private BibliotecaUser user;

    public BibliotecaBorrowRecord(String bookTitle, BibliotecaUser user) {
        this.bookTitle = bookTitle;
        this.user = user;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public BibliotecaUser getUser() {
        return user;
    }
}
