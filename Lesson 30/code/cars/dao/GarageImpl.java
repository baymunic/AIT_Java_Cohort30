package cars.dao;

import cars.models.Car;

public class GarageImpl implements Garage {
    private Car[] cars;
    private int size;


    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
//        cars [size] = car; // ставим В конец массива
//        size++;
        cars[size++] = car; // постфиксная операция ++ увеличивает size после присвоения
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                Car temp = cars[i];
                // на место удалённого ставим последний
                cars[i] = cars[--size]; // префиксное уменьшение
                cars[size] = null;
                return temp;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) { // ищем нужную машину
                Car res = cars[i]; // находим результат
                return res;
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (model.equals(cars[i].getModel())) {
               count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (model.equals(cars[i].getModel())) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (company.equals(cars[i].getCompany())) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (company.equals(cars[i].getCompany())) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByColor(String color) {
//        Car[] existingCars = new Car[size];// Создаем временный массив для хранения найденных машин
//        int count = 0;// Счетчик найденных машин
//        for (int i = 0; i < size; i++) {
//            if (color.equals(cars[i].getColor())) {
//                existingCars[count++] = cars[i];// добавляем машину в массив, если модель совпадает
//            }
//        }
//        Car[] result = new Car[count]; // Создаем новый массив с размером count (количество найденных машин) и копируем в него найденные машины
//        for (int i = 0; i < count; i++) {
//            result[i] = existingCars[i];// операция копирования элементов из массива existingCars в массив result.
//        }
//        return result;

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (color.equals(cars[i].getColor())) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length && i < size; i++) {
            if (color.equals(cars[i].getColor())) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }

}
