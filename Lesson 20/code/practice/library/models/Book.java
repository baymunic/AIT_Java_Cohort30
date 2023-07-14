package practice.library.models;

import java.util.Objects;
import java.util.Scanner;

public class Book {
    // поля
    private String title;
    private String author;
    private int yearOfPublishing;
    public static final int ISBN_LENGTH = 13; // никто не может поменять это значение
    private final long isbn;
    private int age;

    // конструктор

    public Book(String title, String author, int yearOfPublishing, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn); // проверка ISBN
    }

    // конструктор без автора (на случай если нет автора)

    public Book(String title, int yearOfPublishing, long isbn) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn); // проверка ISBN
        author = "unknown";
    }

    public Book(String title, String author, int yearOfPublishing, long isbn, int age) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = isbn;
        this.age = age;
    }


    // метод проверки

    private long checkIsbn(long isbn) {
        if (countDigits(isbn) == ISBN_LENGTH) { // проверка, что 13 цифр
            return isbn;
        }
        return -1;
    }

    // метод, который считает цифры

    private int countDigits(long isbn) {
        int count = 0;
        do {
            count++; // счётчик количества цифр
            isbn /= 10; // делим число на 10
        } while (isbn != 0);
        return count;
    }

    // геттеры и сеттеры


    public int getAge() {
        return age;
    }

   /* public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Эта библиотека НЕ подходит для вашего возраста!");
        }
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    // to String


    @Override
    public String toString() {
        return "Book:" + "title= " + title + ", author= " + author + ", yearOfPublishing= " + yearOfPublishing + ", isbn= " + isbn;
    }

    // equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublishing, isbn);
    }
}
