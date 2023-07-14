import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        /*Задача 4. Пользователь вводит натуральное число (целое, положительное).
        Выясните, сколько цифр в числе.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number");
        int number = scanner.nextInt();

        int count = 0; // начальное значение
        int div = number;

// Алгоритм:
// число делить на нацело на 10 до тех, пор пока частное больше 0 (целочисленное деление)
// 245 / 10 = 24
// 24 / 10 = 2
// 2 / 10 = 0
// на каждом шагу увеличиваем счётчик на 1

        while ( div > 0) { // пока частное больше 0
            div = div / 10; // делим на 10, вычисляем частное
            count++;
            System.out.println(count);

        } // end of while
        System.out.println("Number of digits is: " + count);
    }
}

