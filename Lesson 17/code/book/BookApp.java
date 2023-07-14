package book;

public class BookApp {
    public static void main(String[] args) {

        // создаём объектные переменные book1, book2, book3
        Book book1 = new Book("Heart of Dragon", "Kirill Klevanski", 2016, 1000000001L);
        Book book2 = new Book("Code Da Vinci", "Den Braun", 2003, 1000000002L);
        Book book3 = new Book("Jack London", "White ", 1900, 1000000003L);
        Book book4 = new Book("Two captains", "Kaverin", 950, 10000000004L);
        book1.display();
        book2.display();
        book3.display();
        book4.display();

        // выводим данные

        Dictionary_English dictionaryEnglish = new Dictionary_English("London English Dictionary", "Science Community", 2011, 10000000005L, "English", 50000);
        dictionaryEnglish.display();
        System.out.println();

        Dictionary_Deutsch dictionaryDeutsch = new Dictionary_Deutsch("Berlins Deutsch Dictionary", "Berlins Science Comunity", 2015, 10000000006L, 2460);
        dictionaryDeutsch.display();
    }
}


