package HW_1lesson_18.product;

import java.util.Objects;

public class MeatFood extends Food{
                                            // Поля класса
    private String meatType;

                                    // мы перегрузили родительский метод

    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }

                                              // метод выведения данных

    @Override
    public String toString() {
        return "MeatFood: " + super.getName() + "meat type= " + meatType;
    }


                                                  // сеттеры и геттеры

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }


                                            // метод для сравнения объектов


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MeatFood meatFood = (MeatFood) o;
        return Objects.equals(meatType, meatFood.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatType);
    }
}
