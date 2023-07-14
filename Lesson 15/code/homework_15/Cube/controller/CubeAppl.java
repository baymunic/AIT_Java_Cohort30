package homework_15.Cube.controller;

import homework_15.Cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3); // создаём объект типа Cube
        Cube cube2 = new Cube(4);
        Cube cube3 = new Cube(10);

        cube1.perimetr(3); //вызываем метод perimetr класса  Cube
        System.out.println("Perimetr Cube 1 is: " + cube1.perimetr(3)); // выводим на печать Perimetr

        cube1.square(3); //вызываем метод square
        System.out.println("Square Cube 1 is: " + cube1.square(3)); // выводим на печать square

        cube1.volume(3); //вызываем метод
        System.out.println("Volume Cube 1 is: " + cube1.volume(3)); // выводим на печать square
        System.out.println("=========================");

        cube2.perimetr(4); //вызываем метод perimetr класса  Cube
        System.out.println("Perimetr Cube 2 is: " + cube2.perimetr(4)); // выводим на печать Perimetr

        cube2.square(4); //вызываем метод square
        System.out.println("Square Cube 2 is: " + cube2.square(4)); // выводим на печать square

        cube2.volume(4); //вызываем метод
        System.out.println("Volume Cube 2 is: " + cube2.volume(4)); // выводим на печать square
        System.out.println("=========================");

        cube3.perimetr(10); //вызываем метод perimetr класса  Cube
        System.out.println("Perimetr Cube 3 is: " + cube3.perimetr(10)); // выводим на печать Perimetr

        cube3.square(10); //вызываем метод square
        System.out.println("Square Cube 3 is: " + cube3.square(10)); // выводим на печать square

        cube3.volume(10); //вызываем метод
        System.out.println("Volume Cube 3 is: " + cube3.volume(10)); // выводим на печать square
    }
}
