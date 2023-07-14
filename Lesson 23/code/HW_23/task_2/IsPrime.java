
//Задача 1. Написать метод, определяющий, является ли число простым (primary).
//Доделать задачу про проверку простого числа или нет - сделать метод.

package HW_23.task_2;

public class IsPrime {

    // поле класса
    private int n;

    // метод

    public static boolean isPrimeCheck (int n){
        if (n <= 1) {
            return false;
        }
        // Проверяем делимость числа на числа от 2 до квадратного корня из числа
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Число делится на i без остатка, значит оно не простое
            }
        }
        return true; // Число является простым
    }
}
