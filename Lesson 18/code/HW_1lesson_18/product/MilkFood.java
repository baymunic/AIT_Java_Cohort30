package HW_1lesson_18.product;

import java.util.Objects;

public class MilkFood extends Food{
                                                     // Поля класса
    private String milkType;
    private double fat;

                                            // мы перегрузили родительский метод

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

                                              // метод выведения данных


    @Override
    public String toString() {
        return "MilkFood: " + super.getName() + "milk type= " + milkType + ", fat= " + fat;
    }

                                                // сеттеры и геттеры


    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

                                                // метод для сравнения объектов


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilkFood milkFood = (MilkFood) o;
        return Double.compare(milkFood.fat, fat) == 0 && Objects.equals(milkType, milkFood.milkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), milkType, fat);
    }
}
