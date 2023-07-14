import java.util.Scanner;
        public class HW_11_1_1 {
            public static void main(String[] args) {
// Задача 1 : Вариант 2
// Составьте программу, которая вычисляет сумму чисел от 1 до 1/n. n вводится с клавиатуры.
// Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Для вычисления sum используйте метод.

                Scanner scanner = new Scanner(System.in);

                System.out.println("Input: ");
                double num = scanner.nextDouble();

                double digitsN = numberOfDigits(num);
                System.out.println("Sum of digits: " + digitsN); // выводим результат
            }
            public static double numberOfDigits (double n) {  // используем метод

                double sum = 0;                            // задаём 1-ю переменную
                int i = 1;                              // задаём 2-ю переменную

                while (n >= i){
                    sum = sum + 1.0 / i;                       // суммируем и разделяем
//                    System.out.println("sum: " + sum + "/" + i); // выводим
                    i++;                                // считает количество цифр
                }
                return sum;                               // возвращаем результат
            }
        }
