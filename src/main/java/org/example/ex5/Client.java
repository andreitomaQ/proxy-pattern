package org.example.ex5;

public class Client {
    public static void main(String[] args) {
//        BookParser bookParser = new BookParserImpl("Principles");
        BookParser bookParser = new LazyBookParserProxy("Principles");
        bookParser.getNumPages();
        bookParser.getNumPages();
    }
}
