
//Задача 1. Написать метод, определяющий, является ли число простым (primary).
//Доделать задачу про проверку простого числа или нет - сделать метод.

package HW_19;
import java.util.Scanner;

public class IsPrime_hw {
    public static boolean isPrimeCheck ( int n){
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // используем сканер

        System.out.println("Input integer positive number: "); // запрашиваем у пользователя ввод числа
        int n = scanner.nextInt(); // активируем сканер

        // используем метод isPrimCheck
        if (isPrimeCheck(n)) {
            System.out.println(n + " - является простым числом.");
        } else {
            System.out.println(n + " - НЕ является простым числом.");
        }
    }
}
