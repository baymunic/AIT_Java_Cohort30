package practice.models;

// добавление, удаление, поиск книги
public class Library {

    private Book[] books;  // массив типа Book, куда попадут все книги в библиотеке
    private int size;  // количество книг в библиотеке
    private int age;

    // метод класса, который задаёт размер библиотеки, то есть длину/размер массива
    public Library(int capacity) {
        books = new Book[capacity];
    }

    // добавление книги

    public boolean addBook(Book book) {
        if ((size == books.length) || findBook(book.getIsbn()) != null) {
            return false; // мы не можем добавить книгу, так как нет места или такая книга уже есть
        }
        books[size] = book; // в ячейку по имени size, помещаем книгу в массив
        size++;
        return true;
    }

    // метод поиска книги по ISBN
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (books[i].getIsbn() == isbn) { // проверяем совпадение ISBN
                return books[i]; // возвращаем элемент массива типа Book
            }
//            books[i].getAuthor();
        }
        return null;
    }

    // метод поиска книги по author
    public Book[] findBookAuthor(String author, Book[] books) {
        // count how many books of author
        int count = 0;
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (author.equals(books[i].getAuthor())) { // проверяем совпадение ISBN
                count++; // возвращаем элемент массива типа Book
            }
        }
        // заполним массив с результатами поиска
        Book[] booksfinder = new Book[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; i < size; i++) { // пробегаем по массиву
                if (author.equals(books[i].getAuthor())) { // проверяем совпадение ISBN
                    booksfinder[i] = books[j]; // заполняем массив booksfinder
                    j++;
                }
            }
        }
        return booksfinder;
    }

    // метод поиска книги по author
    public Book findBookTitle(String title) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (title.equals(books[i].getTitle())) { // проверяем совпадение ISBN
                return books[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }

    public int getSize (){
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Эта библиотека НЕ подходит для вашего возраста!");
        }
    }

    // метод удаления книги из библиотеки
    // надо найти книгу
    // последнюю книгу ставим на место удалённой, , количество книг в библиотеке -1

    public Book removeBook(long isbn, Book[] books) {
        Book victim = null;

        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn) {
                victim = books[i];
                        books[i] = books[size - 1]; // на место удаляемой ставим последнюю книгу
                        books[size - 1] = null; // стираем последнюю книгу, тк она теперь стоит на месте удалённой
                        size--; //
                        break;
            }
        }
        return victim;
    }
}
