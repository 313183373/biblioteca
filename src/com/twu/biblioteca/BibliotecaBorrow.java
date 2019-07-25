package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class BibliotecaBorrow {
    private ArrayList<BibliotecaBorrowRecord> borrowRecords = new ArrayList<>();
    private BibliotecaView view;

    public BibliotecaBorrow(BibliotecaView view) {
        this.view = view;
    }

    public void borrowABook(String title) {
        if (hasTheBook(title) && !isTheBookBorrowed(title)) {
            borrowRecords.add(new BibliotecaBorrowRecord(title));
            view.showCheckoutSucceedMessage();
        } else {
            view.showCheckoutFailMessage();
        }
    }

    public void returnABook(String title) {
        if (hasTheBook(title) && isTheBookBorrowed(title)) {
            removeRecord(title);
            view.showReturnBookSucceedMessage();
        } else {
            view.showReturnBookFailMessage();
        }
    }

    private boolean hasTheBook(String title) {
        return BibliotecaBooks.books.stream().anyMatch(book -> book.getTitle().equals(title));
    }

    private boolean isTheBookBorrowed(String title) {
        return borrowRecords.stream().anyMatch(record -> record.getBookTitle().equals(title));
    }

    private void removeRecord(String title) {
        Iterator<BibliotecaBorrowRecord> iterator = borrowRecords.iterator();
        while (iterator.hasNext()) {
            BibliotecaBorrowRecord record = iterator.next();
            if (record.getBookTitle().equals(title)) {
                iterator.remove();
                break;
            }
        }
    }
}
