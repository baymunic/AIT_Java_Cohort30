package practice.rectangle.controller;

import practice.rectangle.model.Rectangle;

public class RectangleApplication {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10.0, 25.0); // создаём объект типа Rectangle

        //вызываем метод perimetr класса  Rectangle для конкреткого экземпляра класса
        rectangle1.perimetr(10, 25);

        // выводим на печать Perimetr
        System.out.println(rectangle1.perimetr(10, 25));
        
        double s = rectangle1.square(10, 25);
        System.out.println("Square is: " + s);

        rectangle1.setA(50);
        rectangle1.setB(100);

        System.out.println(rectangle1.a);
        System.out.println(rectangle1.b);
    }
}
