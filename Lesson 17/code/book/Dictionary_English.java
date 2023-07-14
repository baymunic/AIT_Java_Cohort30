package book;

public class Dictionary_English extends Book {

    String type;
    int wordsAmount;

    // мы перегрузили родительский метод
    public Dictionary_English(String title, String author, int year, long ISBN, String type, int wordsAmount) {
        super(title, author, year, ISBN);
        this.type = type;
        this.wordsAmount = wordsAmount;
    }

 // метод выведения данных
    @Override
    public void display() {
        super.display();
        System.out.print("Type: " + type + " |" + "Words amount: " + wordsAmount + " |");
    }

    // сеттеры и геттеры
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWordsAmount() {
        return wordsAmount;
    }

    public void setWordsAmount(int wordsAmount) {
        this.wordsAmount = wordsAmount;
    }
}
