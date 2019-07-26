package com.twu.biblioteca;

class BibliotecaBorrowRecord {
    private String bookTitle;

    BibliotecaBorrowRecord(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getBookTitle() {
        return bookTitle;
    }
}
