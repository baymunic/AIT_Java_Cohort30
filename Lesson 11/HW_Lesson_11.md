**Задача 1**
Составьте программу, которая вычисляет сумму чисел от 1 до 1/n. n вводится с клавиатуры. 
Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Для вычисления sum используйте метод.

import java.util.Scanner;
public class Homework_11_1 {
public static void main(String[] args) {

// Задача 1 : 1-й Вариант - через INT
// Составьте программу, которая вычисляет сумму чисел от 1 до 1/n. n вводится с клавиатуры.
// Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Для вычисления sum используйте метод.

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input: ");
        int num = scanner.nextInt();

        int digitsN = numberOfDigits(num);
        System.out.println("Number of digits: " + digitsN); // выводим результат
    }
    public static int numberOfDigits (int n) {  // используем метод
        
        int sum = 0;                            // задаём 1-ю переменную
        int i = 1;                              // задаём 2-ю переменную
        
        while (i <= 10){
            sum += 1 / i;                       // суммируем и разделяем
            System.out.println("sum: " + sum + "/" + i); // выводим
            i++;                                // считает количество цифр
        }
        return i;                               // возвращаем результат
    }
}

,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

import java.util.Scanner;
public class HW_11_1_1 {
public static void main(String[] args) {

// Задача 1 : 2-й Вариант - через DOUBLE
// Составьте программу, которая вычисляет сумму чисел от 1 до 1/n. n вводится с клавиатуры.
// Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Для вычисления sum используйте метод.

                Scanner scanner = new Scanner(System.in);

                System.out.println("Input: ");
                double num = scanner.nextDouble();

                double digitsN = numberOfDigits(num);
                System.out.println("Number of digits: " + digitsN); // выводим результат
            }
            public static double numberOfDigits (double n) {  // используем метод

                double sum = 0;                            // задаём 1-ю переменную
                double i = 1;                              // задаём 2-ю переменную

                while (n >= i){
                    sum = sum + 1.0 / i;                       // суммируем и разделяем
                    i++;                                // считает количество цифр
                }
                return sum;                               // возвращаем результат
            }
        }

______________________________________________________________________________

**Задача 2**
Вводится n - натуральное число. Напишите метод, который получает на вход n 
и вычисляет n! = 1 * 2 * 3 *... * n (n факториал) 10! = 1 * 2 * 3 * ... * 10 
Вызовите полученный метод. При каком значении n происходит переполнение памяти, 
выделяемой для n типа int?

import java.util.Scanner;
public class nFactorial {
public static void main(String[] args) {
/* **Задача 2**
Вводится n - натуральное число. Напишите метод, который получает на вход n
и вычисляет n! = 1 * 2 * 3 *... * n (n факториал) 10! = 1 * 2 * 3 * ... * 10
Вызовите полученный метод. При каком значении n происходит переполнение памяти,
выделяемой для n типа int? */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your natural number: ");
        int num = scanner.nextInt();
        int digits = nFactorial(num);

        System.out.println("N factorial: " + digits);
    }
    public static int nFactorial (int n) {
        int i = 1;
        int fact = 1;

        while (i <= n){
              fact = fact * i;
           i++;
        }
        return fact;
    }
}

________________________________________________________________________________

**Задача 11.3**
Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых. 
Через сколько лет его долг превысит s тысяч рублей, 
если за это время он не будет отдавать долг.

public class Kredit {
public static void main(String[] args) {
/* Задача 3:
Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
Через сколько лет его долг превысит s тысяч рублей,
если за это время он не будет отдавать долг. */

        double m = 1000;   // размер ссуды 
        double sumYears = KreditA(m); // вызываем метод 
        System.out.println(sumYears);  // выводим результат
    }
    public static double KreditA (double x) {  // используем метод для вычисления 
        double m = 1000;                       // 1-я переменная
        double s = 3000;                       // 2-я переменная
        double i = 0.1;                        // процент
        int years = 0;                         //  
        do {                                   // используем do while
            m = m + m * i;                     // суммируем и умножаем на процент
            years++;                           // считает количество цифр
        } while (m <= s);                      // задаём условие
        return years;                           // возвращаем результат
    }
}