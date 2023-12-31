package book;

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
        System.out.println();
        System.out.print("Title " + title + " |" + "Author " + author + " |" + "Year " + year + " |" + "ISBN " + ISBN + " |");
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
        if (year < 1450 || year > 2023) {
            System.out.println("This year is not allowed ");
            this.year = -1;
        } else {
            this.year = year;
        }
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
}


