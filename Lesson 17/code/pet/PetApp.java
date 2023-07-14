package pet;

public class PetApp {
    public static void main(String[] args) {

        // создаём объектную переменную класса Beverage с полями и их значениями

        Dog Sharik = new Dog("Sharik","Dog", 5, "On the street");
        Sharik.display();
        Sharik.eat();
        Sharik.sleep();
        Sharik.run();
        Sharik.voice();
        System.out.println("=================================");

        Dog Bobik = new Dog("Bobik","Dog", 12, "On the street");
        Bobik.display();
        Bobik.voice();
        Bobik.eat();
        Bobik.run();
        Bobik.sleep();
        System.out.println("=================================");

        Cat Murzik = new Cat("Murzik","Cat", 7, "Home");
        Murzik.display();
        Murzik.voice();
        Murzik.voice();
        Murzik.eat();
        Murzik.sleep();
        System.out.println("=================================");

        Cat Barsik = new Cat("Barsik","Cat", 12, "Home");
        Barsik.display();
        Barsik.sleep();
        Barsik.eat();
        Barsik.voice();
        System.out.println("=================================");

        Cat Tom = new Cat("Tom","Cat", 18, "Home");
        Tom.display();
        Tom.voice();
        Tom.eat();
        Tom.sleep();

    }
}
