package book;

public class Dictionary_Deutsch extends Book {

    int numberOfPages;

    public Dictionary_Deutsch(String title, String author, int year, long ISBN, int numberOfPages) {
        super(title, author, year, ISBN);
        this.numberOfPages = numberOfPages;
    }
    // метод выведения данных
    public void display() {
        super.display();
        System.out.print("Number of pages: " + numberOfPages + " |");
    }

    // сеттеры и геттеры

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
