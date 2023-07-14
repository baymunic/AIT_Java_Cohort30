import java.util.Scanner;
public class Homework_11_1 {
    public static void main(String[] args) {
        // Задача 1 : вариант 1
        //Составьте программу, которая вычисляет сумму чисел от 1 до 1/n. n вводится с клавиатуры.
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

        while (i <= n){
            sum += 1 / i;                       // суммируем и разделяем
            System.out.println("sum: " + sum + "/" + i); // выводим
            i++;                                // считает количество цифр
        }
        return i;                               // возвращаем результат
    }
}
