package practice.library;

import java.util.Scanner;
import practice.library.models.Book;
import practice.library.models.Library;

public class LibraryApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library(1000);
        library.addBook(new Book("War and Peace", "Lev Tolstoi", 1990, 2000000000000L));
        library.addBook(new Book("Anna Karenina", "Lev Tolstoi", 1995, 2000000000001L));
        library.addBook(new Book("1984", "Orwell", 1985, 2000000000002L));
        library.addBook(new Book("451", "Ray Bradberry", 1965,2000000000005L));
        System.out.println("Добавлено " + library.getSize() + " книги");

     /*   System.out.println("Please input an author: ");
        System.out.println(library.findBookAuthor(scanner.nextLine()));

        System.out.println("Please input an title: ");
        System.out.println(library.findBookTitle(scanner.nextLine()));*/

    /*    System.out.println("Please input your age: ");
        System.out.println(library.setAge(scanner.nextInt()));*/

        Book[] books; // создаём массив типа Book
        books = new Book[4];

        books[0] = new Book("War and Peace", "Lev Tolstoi", 1990,2000000000000L);
        books[1] = new Book("Anna Karenina", "Lev Tolstoi", 1995,2000000000001L);
        books[2] = new Book("451", "Ray Bredberry", 1965,2000000000002L);
        books[3] = new Book("1984", "George Orwell", 1985,2000000000003L);

        System.out.println("Please input an author: ");
        System.out.println(library.findBookAuthor("Lev Tolstoi", books));

        Book[] booksfinder;
        booksfinder = library.findBookAuthor("Lev Tolstoi", books);

        for (int i = 0; i < booksfinder.length; i++) {
            System.out.println(booksfinder[i]);
        }
    }
}
