/*Задача 1.
 Создать класс Book в пакете xxx.book.model. В этом классе определить поля:
 private long isbn; private String title; private String author; private int yearOfPublishing;
 Создать конструкторы для иницализации всех полей, и конструктор для инициализации полей при отсутствии автора.
 Остальные конструкторы на Ваше усмотрение.
 Создать геттеры и сеттеры, исходя из логики и необходимости.
 Создать метод public void display() для печати в консоль информации о книге.

Создать класс BookAppl в пакете xxx.book с методом main.
В методе main создать несколько экземпляров Book и вывести для каждого из них результат работы метода display.*/

package book.model;

public class Book {
    // поля класса  Book
   private String title; // название - title
   private String author;  // автор - author
   private int year;  // год выпуска - year
   private long ISBN; // уникальный номер книги - ISBN

   // методы класса  Book
   // конструктор


    public Book(String title, String author, int year, long ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }

    public Book(String title, int year, long ISBN) {
        this.title = title;
        this.year = year;
        this.ISBN = ISBN;
    }
    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void display () {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
    public void display1 () {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
    public void display2 () {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println();
    }

    // геттеры и сеттеры

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
            this.year = year;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
}
