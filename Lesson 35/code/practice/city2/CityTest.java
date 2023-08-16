package practice.city2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {
    // вызвать тестируемый класс
    City[] cities;

    @BeforeEach
    void setUp() {
        // создать тестовый набор данных

        cities = new City[6]; // создаем массив

        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    // метод для печати массива + строка-анонс списка
    private void printArray(Object[] arr, String title) {
        System.out.println("===== " + title + " =====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // будем искать город в массиве методом BinarySearch, и смотреть, что он нам вернёт
    // BinarySearch можно применять ТОЛЬКО к отсортированному массиву

    @Test
    void testBinarySearch (){
        printArray (cities, " Original array");
        System.out.println();
        Arrays.sort(cities); // сортировка в "естественном" порядке
        printArray(cities, "Natural order (population)");

        // ТЕПЕРЬ МОЖНО ПРИМЕНЯТЬ BinarySearch
        City pattern = new City(null, 3_000_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println("Index= " + index);

    }
    // сортировка по имени (по алфавиту), сделаем с помощью Comparator

    @Test
    void testBinarySearch1 () {
        printArray(cities, " Original array");
        System.out.println();

        //1. Вариант
        Comparator<City> cityComparator = (c1, c2) -> c1.getName().compareTo(c2.getName());

        //2. Вариант
//        Comparator<City> cityComparator1 = new Comparator<City>() {
//            @Override
//            public int compare(City o1, City o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };

        //3. Вариант
//        Comparator<City> cityComparator = Comparator.comparing(City::getName); // сравниваем объекты класса City по именам

        Arrays.sort(cities, cityComparator); // выполнили сортировку

        printArray(cities, "Sort by Name");

        City pattern = new City("Chicago", 0);
//        City pattern = cities[2];
        int index = Arrays.binarySearch(cities, pattern, cityComparator); // поиск по имени

        System.out.println("Index= " + index);


    }

    // увеличиваем массив в 2 раза
    @Test
    void testArrayCopy () {
        printArray(cities, " Original array");
        System.out.println();

        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, " citiesCopy before sorting");

        // пытаемся провести сортировку этого массива "натуральным" способом
//        Arrays.sort(citiesCopy);
//        printArray(citiesCopy, " citiesCopy after sorting");
        // массив с null внутри не сортируется стандартном образом

        Comparator<City> cityComparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(citiesCopy, 0, cities.length, cityComparator);
        printArray(citiesCopy, " citiesCopy after sorting 2");
        // сортировать можно только без null, ту часть массива, где их нет

    }


}