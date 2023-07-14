public class Exercise_13_1 {
public static void main(String[] args) {
// Задача 1. Написать метод, принимающий массив целых чисел,
// и возвращающий сумму всех его нечетных элементов (не индексы!, а сами элементы).
// Массив на 100 элементов задать случайными числами в интервале от 1 до 100.

        int[] num = new int[100];
        int a = 1, b = 100;

        for (int i = 0; i < num.length; i++) {
        //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
            }
        printOddNumbers(num);  // печатаем наш метод
    }
    public static void printOddNumbers(int[] arr) {   //используем метод для выявления нечетных элементов и суммируем их
        int sumEven = 0;     //  задаём переменную для чётных
        int sumOdd = 0;      // задаём переменную для нечётных
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {   // вычисляем нечётные элементы
                sumOdd = sumOdd + arr[i]; // суммируем их
                System.out.println("          Odd number: " + arr[i]); // выводим нечётные элементы
            } else {                  // вычисляем чётные элементы
                System.out.println("Even number: " + arr[i]);
                sumEven = sumEven + arr[i]; // суммируем их
                sumEven++;                 // выводим чётные элементы
            }
            }
        System.out.println();
        System.out.println("Sum of odd numbers: " + sumOdd); // выводим сумму нечётных элементов
        System.out.println("Sum of even numbers:" + sumEven); // выводим сумму чётных элементов
    }
}

_______________________________________________________________

public class Exercise_13_2 {
public static void main(String[] args) {
// Задача 2. Написать метод, принимающий массив целых чисел,
// и возвращающий произведение всех его элементов, с четными индексами.
// 0 - тоже четное число.

        int[] num = new int[100];
        int a = 1, b = 100;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printOddNumbers(num);  // печатаем наш метод
    }
    public static void printOddNumbers(int[] arr) {   //используем метод для выявления четных элементов
        int sumEven = 0;     //  задаём переменную для чётных
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {   
            } else {                  // вычисляем чётные элементы
                System.out.println("Even number: " + arr[i]);
                sumEven = sumEven + arr[i]; // суммируем их
                sumEven++;                 // выводим чётные элементы
            }
        }
    }
}

____________________________________________________________

import java.util.Scanner;
public class Exercise_13_3 {
public static void main(String[] args) {
//Задача 3. Пользователь вводит строку.
// Распечатайте эту строку в обратном порядке.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your String: "); // запрашиваем строку
        String inputString = scanner.nextLine();   // вводим строку
        
        String reversedString = new StringBuffer(inputString).reverse().toString(); // переворачиваем строку
        System.out.println(reversedString);   // выводи результат
    }
}