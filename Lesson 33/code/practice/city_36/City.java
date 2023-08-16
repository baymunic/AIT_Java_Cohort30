package practice.city_36;

import java.util.Objects;

public class City implements Comparable<City> {

    //поля
    private String name;
    private int population;
    private int pollution;
    private String postcode;

    // конструктор
    public City(String name, int population, int pollution, String postcode) {
        this.name = name;
        this.population = population;
        this.pollution = pollution;
        this.postcode = postcode;
    }

    // геттеры
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getPollution() {
        return pollution;
    }

    public String getPostcode() {
        return postcode;
    }

    // сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPollution(int pollution) {
        this.pollution = pollution;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    //to String
    @Override
    public String toString() {
        return "City{" + "name='" + name + '\'' + ", population=" + population + ", pollution=" + pollution + ", postcode='" + postcode + '\'' + '}';
    }


    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(postcode, city.postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, postcode);
    }

    @Override
    public int compareTo(City o) { // City o - второй объект из сравниваемых, а где первый объект, с котором происходит сравнение?
//        return this.name.compareTo(o.name); // сортировка по имени по алфавиту, таков естественный порядок для этого класса
    return -(this.population - o.population); // сортируем по кол-ву населения и большие города сверху
    }
}
