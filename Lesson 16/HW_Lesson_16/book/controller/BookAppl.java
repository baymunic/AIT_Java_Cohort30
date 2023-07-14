package book.controller;

import book.model.Book;

public class BookAppl {
    public static void main(String[] args) {

        // создаём объектные переменные book1, book2, book3
        Book book1 = new Book("Two Towers", "Luke Besson", 2020, 1000000001L);
        Book book2 = new Book("Superior Lake", 2002, 1000000002L);
        Book book3 = new Book("Fall of London", 2018);

        book1.display();
        book2.display1();
        book3.display2();
    }
}
