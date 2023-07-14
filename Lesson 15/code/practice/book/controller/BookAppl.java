package practice.book.controller;

import practice.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {

        // создаём объектные переменные book1, book2, book3
        Book book1 = new Book("Heart of Dragon", "Kirill Klevanski", 2016, 1000000001L);
        Book book2 = new Book("Code Da Vinci", "Den Braun", 2003, 1000000002L);
        Book book3 = new Book("Jack London", "White ", 1900, 1000000003L);

        book1.display();
        book2.display();
        book3.display();
    }
}
