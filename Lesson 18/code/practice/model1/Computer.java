package practice.model1;

import java.util.Objects;

public class Computer {
    // Поля класса

    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;

    // конструктор

    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    // геттеры и сеттеры

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd;
    }

    // метод для сравнения объектов

    @Override
    public boolean equals(Object o) {  // сигнатура метода: модификатор, ТИП ВОЗВРАЩЯЕМОВОГО методом значения, Имя метода,
        // тип переменной и её имя, которое принимает метод
        if (this == o) return true;  // если мы сравниваем объект сам с собой, возвращаем TRUE
        if (o == null || getClass() != o.getClass()) return false;  // если сравниваем с NULL или объекты из разных классов
        Computer computer = (Computer) o;  // производим downcasting  предложеного для сравнения объекта до класса Computer
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);  // логическое выражение
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand);
    }
}
