package computer;

public class CompApp {
    public static void main(String[] args) {

        // создаём объектную переменную класса Computer с полями и их значениями
        Computer comp1 = new Computer("i5", 16, 512, "HP");
        comp1.display();

        Computer comp2 = new Computer("i5", 16, 512, "Asus");
        comp2.display();

        Laptop lap1 = new Laptop("i7", 32, 1024, "Predator", 17, 2, "Black");
        lap1.display();
    }
}
