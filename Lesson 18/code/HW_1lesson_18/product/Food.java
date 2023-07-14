package HW_1lesson_18.product;

import java.util.Objects;

public class Food extends Product{
    private boolean isOutOfDate;

    // мы перегрузили родительский метод
    public Food(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode);
        this.isOutOfDate = isOutOfDate;
    }

// метод выведения данных


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Food: " + super.getName() + "is out of date= " + isOutOfDate;
    }

    // сеттеры и геттеры
    public boolean isOutOfDate() {
        return isOutOfDate;
    }

    public void setOutOfDate(boolean outOfDate) {
        isOutOfDate = outOfDate;
    }

// метод для сравнения объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Food food = (Food) o;
        return isOutOfDate == food.isOutOfDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOutOfDate);
    }
}
