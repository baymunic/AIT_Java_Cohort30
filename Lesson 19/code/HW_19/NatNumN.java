
// Задача 2. Вводится пользователем натуральное число n.
// Сформировать массив из всех делителей данного числа.

package HW_19;
import java.util.Scanner;

public class NatNumN {
    public static int[] getDivisors (int n) {
       int count = 0;  // объявление переменную
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2; // Учитываем делитель и соответствующий ему делитель n/i
            }
        }
        int[] divisors = new int[count];
        int index = 0;

        // Заполняем массив делителями числа n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors[index++] = i;

                // Если делитель не является квадратом числа n, добавляем также соответствующий делитель
                if (i != Math.sqrt(n)) {
                    divisors[index++] = n / i;
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число n: ");
        int n = scanner.nextInt();

        // Формируем массив делителей числа n
        int[] divisors = getDivisors(n);

        // Выводим результат
        System.out.println("Массив делителей числа " + n + ": ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
}
