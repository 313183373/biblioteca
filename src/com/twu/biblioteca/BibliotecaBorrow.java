package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaBorrow {
    private ArrayList<BibliotecaBorrowRecord> borrowRecords = new ArrayList<>();
    private BibliotecaView view;

    public BibliotecaBorrow(BibliotecaView view) {
        this.view = view;
    }

    public void borrowABook(String title) {
        if (isTheBookAvailable(title)) {
            borrowRecords.add(new BibliotecaBorrowRecord(title));
            view.showCheckoutSucceedMessage();
        } else {
            view.showCheckoutFailMessage();
        }
    }

    private boolean isTheBookAvailable(String title) {
        return hasTheBook(title) && !isTheBookBorrowed(title);
    }

    private boolean hasTheBook(String title) {
        return BibliotecaBooks.books.stream().anyMatch(book -> book.getTitle().equals(title));
    }

    private boolean isTheBookBorrowed(String title) {
        return borrowRecords.stream().anyMatch(record -> record.getBookTitle().equals(title));
    }
}
