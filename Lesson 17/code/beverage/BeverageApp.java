package beverage;

public class BeverageApp {
    public static void main(String[] args) {

        // создаём объектную переменную класса Beverage с полями и их значениями

        Beverage drink1 = new Beverage();
        drink1.displayStock();
        drink1.toBuy("Cola", "bottle", 5);
        drink1.displayStock();

        System.out.println("==================================");

        Beverage drink2 = new Beverage();
        drink2.displayStock();
        drink2.toBuy("Wine", "box", 3);
        drink2.displayStock();

        Beer beer1 = new Beer();
        beer1.toBuy("Beer", "box", 3, "weiss beer" );
    }
}
