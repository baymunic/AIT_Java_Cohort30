import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("If - else practice - next - next");
        /*Задание 3: Написать метод, выводящий на экран максимальное из трех целых чисел.
        Числа должны вводится с клавиатуры.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st number");
        int a = sc.nextInt();
        System.out.println("Input 2nd number");
        int b = sc.nextInt();
        System.out.println("Input 3rd number");
        int c = sc.nextInt();

        // Алгоритм:
        // Шаг 1 - объявить переменую Мах
        // Шаг 2 - присвоим Мах = а
        // Шаг 3 - сравним b и Max, если b > Max то Max = b
        // Шаг 4 - сравним c и Max, если c > Max то Max = c

        int maximum = maxABC(a, b, c); // вызов метода и передали ему на вход три числа a, b и c
        System.out.println("Max from: " + a + ", " + b + ", " + c + " is: " + maximum); // print result

        }
        // ______Methods_______
    public static int maxABC (int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

}