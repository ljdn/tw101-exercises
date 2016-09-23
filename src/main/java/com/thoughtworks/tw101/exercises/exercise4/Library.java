package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        // assuming we want to ignore upper / lower case, which is usually true when searching for books

        for (String book :
                books) {
            if (book.toLowerCase().contains(partialBookTitle.toLowerCase()))
            {
                printStream.println(book);
            }
        }

    }
}
