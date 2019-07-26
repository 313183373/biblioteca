package com.twu.biblioteca.Model;

public class BibliotecaBook {
    private String title;

    private String author;

    private String publicationYear;

    public BibliotecaBook(String title, String author, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return String.format("%-30s|%25s|%7s", title, author, publicationYear);
    }

    public String getTitle() {
        return title;
    }
}
