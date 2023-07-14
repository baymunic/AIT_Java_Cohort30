package HW_22;

import java.util.Scanner;

public class AmoebaDivision {
    public static void main(String[] args) {
        //  Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
        //  Необходимо определить, сколько будет амёб через n часов, если первоначально была только одна амёба.

        System.out.println("Введите количество часов: ");

        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Количество амёб через " + hours + " часов: " + calculateAmoebaCount(hours));
    }
    // метод calculateAmoebaCount, принимает количество часов и вычисляет количество амёб через это количество часов
    public static int calculateAmoebaCount(int hours) {
        int amoebaCount = 1; // задаём переменную

        for (int i = 1; i <= hours; i++) { // цикл for для умножения количества амёб на 2 на каждой итерации
            amoebaCount *= 2;
        }
        return amoebaCount; // количество амёб, которые будут через введённое нами времени
    }
}
