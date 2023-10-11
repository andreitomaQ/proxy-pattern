package org.example.ex5;

public class LazyBookParserProxy implements BookParser {
    private BookParser bookParser;
    private final String book;

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    @Override
    public int getNumPages() {
        if (bookParser == null) {
            System.out.println("Lazy init BookParserImpl for book " + book);
            bookParser = new BookParserImpl(book);
        }

        return bookParser.getNumPages();
    }
}
