package hw_33.soldier;

import java.util.Objects;

public class Soldier implements Comparable<Soldier> {
    //поля
    private String name;
    private int height;
    private int weight;
    private int profile;

    //конструктор
    public Soldier(String name, int height, int weight, int profile) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.profile = profile;
    }

    //геттеры
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getProfile() {
        return profile;
    }

    //сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    //to String
    @Override
    public String toString() {
        return "Soldier{" + "name='" + name + '\'' + ", height=" + height + ", weight=" + weight + ", profile='" + profile + '\'' + '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return Objects.equals(name, soldier.name) && Objects.equals(profile, soldier.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, profile);
    }

    @Override
    public int compareTo(Soldier o) {
        return this.name.compareTo(o.name); // сортировка по имени по алфавиту, таков естественный порядок для этого класса
    }
}
