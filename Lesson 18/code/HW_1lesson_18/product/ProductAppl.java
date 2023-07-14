package HW_1lesson_18.product;

import HW_1lesson_18.product.Product;
import HW_1lesson_18.product.Food;
import HW_1lesson_18.product.MeatFood;
import HW_1lesson_18.product.MilkFood;

public class ProductAppl {
    public static void main(String[] args) {

        Product prod1 = new Product(12.50, "Lasagna ", 1000000001L);
        Food prod2 = new Food(3.75, "Schaff Käse ", 1000000001L, true);
        Food prod3 = new Food(4.25, "Yoghurt ", 1000000003L, false);
        MeatFood prod4 = new MeatFood(7.50, "Rabbit meat ", 1000000003L, true, "Rabbit");
        MilkFood prod5 = new MilkFood(13.25, "Bureonka ", 1000000002L, false, "Fresh", 3.8);
        MilkFood prod6 = new MilkFood(10.50, "Babushkino Moloko ", 1000000002L, true, "Fresh", 1.5);


        Product[] arrayOfProduct = new Product[6];
        arrayOfProduct[0] = prod1;
        arrayOfProduct[1] = prod2;
        arrayOfProduct[2] = prod3;
        arrayOfProduct[3] = prod4;
        arrayOfProduct[4] = prod5;
        arrayOfProduct[5] = prod6;

        printArrayProduct(arrayOfProduct);  // печатаем массив объектов
        System.out.println("Sum of prices: " + sumProd(arrayOfProduct)); // вычисляем сумму цен всех продуктов в магазине

        System.out.println("Сравниваем продукты по баркодам: " + prod1.equals(prod2));
        System.out.println("Сравниваем продукты по разным баркодам: " + prod2.equals(prod3));



    }
    public static void printArrayProduct (Object[] arr) {
        for (int i = 0; i < arr.length; i++) { // это array внутри метода
            System.out.println(arr[i].toString());

        }
    }
    public static double sumProd (Product[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();
        }

        return sum;
    }


}
