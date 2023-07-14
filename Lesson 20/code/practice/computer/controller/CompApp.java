package practice.computer.controller;

import practice.computer.Computer;

public class CompApp {
    public static void main(String[] args) {

        // создаём объектную переменную класса Computer с полями и их значениями
 //       Computer comp1 = new Computer("i5", 16, 512, "HP");
 //      comp1.display();

 //       Computer comp2 = new Computer("i5", 16, 512, "Asus");
 //       comp2.display();

 //       Laptop lap1 = new Laptop("i7", 32, 1024, "Predator", 17, 2, "Black");
 //       lap1.display();

        Computer comp3 = new Computer();
        comp3.setRam(-512);
        comp3.setCpu("Intel");
        comp3.setSsd(64);
        System.out.println(comp3.toString());

        comp3.computerTurnOn();
        System.out.println(comp3);
        
        Computer comp4 = new Computer("i7", 16, 512, "Asus", "Off");
        System.out.println(comp4);
    }
}
