package org.example.ex5;

public class BookParserImpl implements BookParser {
    private final String computedBook;

    public BookParserImpl(String book) {
        computedBook = heavyComputation(book);
    }

    public int getNumPages() {
        return computedBook.length();
    }

    private String heavyComputation(String book) {
        System.out.println("Expensive parsing for " + book);
        return book;
    }
}
