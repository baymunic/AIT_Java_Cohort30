
// Задача 4.(*) Найти все простые числа меньше введенного числа n и занести их в массив.
// В консоли распечатать само число, количество найденных простых чисел и сами эти числа.
// Пример: дано число 30 простые числа, меньшие 30 это: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
// таких чисел: 10

package HW_19;
import java.util.Scanner;

    public class PrimeNumbersArray {
        // используем метод для выявления простых чисел и занесения их в массив
        public static int[] getPrimeNumbers(int n) {
            // Инициализируем массив для хранения простых чисел
            int[] primes = new int[n];
            int count = 0;

            // Проверяем каждое число от 2 до n-1 на простоту
            for (int number = 2; number < n; number++) {
                boolean isPrime = true;

                // Проверяем делители от 2 до квадратного корня из number
                for (int i = 2; i <= Math.sqrt(number); i++) { // эффективное сокрашение делителей числа
                    if (number % i == 0) {
                        isPrime = false; // Число number не является простым
                        break;
                    }
                }
                if (isPrime) {
                   primes[count++] = number; // Добавляем простое число в массив
                }
            }

            // Создаем новый массив нужного размера
            int[] result = new int[count];
            System.arraycopy(primes, 0, result, 0, count);

            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            // Формируем массив простых чисел меньше n
            int[] primes = getPrimeNumbers(n);

            // Выводим результат
            System.out.println("Число n: " + n);
            System.out.println("Количество простых чисел: " + primes.length);
            System.out.print("Простые числа: ");
            for (int prime : primes) {
                System.out.print(prime + " ");
            }
        }
    }
