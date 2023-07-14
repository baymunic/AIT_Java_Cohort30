package HW_19;
import java.util.Scanner;
public class NatNumN2 {
    public static void main(String[] args) {
        // Задача 2. Вводится пользователем натуральное число n.
        // Сформировать массив из всех делителей данного числа.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число n: ");
        int n = scanner.nextInt();

        int array[] = new int[100];
        int count = 0; // объявление переменную

        // Заполняем массив делителями числа n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                array[count] = i;
                count++;
            }
        }
        for (int i = 0; i <= count - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
