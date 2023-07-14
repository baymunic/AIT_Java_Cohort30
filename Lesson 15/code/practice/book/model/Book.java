package practice.book.model;

public class Book {
    // поля класса  Book
   public String title; // название - title
   public String author;  // автор - author
   public int year;  // год выпуска - year
   public long ISBN; // уникальный номер книги - ISBN

   // методы класса  Book
   // конструктор


    public Book(String title, String author, int year, long ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }

    public void display () {
        System.out.println("Title " + title + ",");
        System.out.println("Author " + author + ",");
        System.out.println("Year " + year + ",");
        System.out.println("ISBN " + ISBN + ",");
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
