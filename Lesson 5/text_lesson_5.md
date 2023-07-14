public class Main {
public static void main(String[] args) {
System.out.println("Арифметические дейтвия и класс Math");

        int i = 0;
        i++; // увеличение i на 1
        System.out.println(i);

    }
}

_______________________________________
**Арифметические действия, класс Math - продолжение:**

1 - нахождение угла в треугольнике по двум имеющимся

2 - вычисление длины окружности и площади круга

3 - нахождение минимального и максимального из 2-х чисел

4 - вычисление площади треугольника по его основанию и высоте

5 - Написать программу для вычисления средней стомости поездки
по транспортному проездному. Попросить пользователя ввести стоимость 
проездного на месяц и количество рабочих дней в месяце. Считая, 
что в рабочий день в среднем две поездки, и 1.5 поездки в выходной, 
посчитать и округлить общее число поездок в месяц и посчитать 
среднюю стоимость одной поездки по проездному.

**1**
import java.util.Scanner;

public class Main {
public static void main (String[] args) {
System.out.println("Задачи на вычисления");
// нахождение угла в треугольнике по двум имеющимся
// Cумма углов в треугольнике = 180 градусов

        Scanner scanner = new Scanner(System.in); // включили Scanner
        System.out.println("Bычисление угла триуголька по двум другим");

        System.out.println(" Input 1st angle: "); // запрос величины 1-го угла
        int a1 = scanner.nextInt(); // считываем значение угла с клавиатуры

        System.out.println(" Input 2nd angle: "); // запрос величины 2-го угла
        int a2 = scanner.nextInt(); // считываем значение угла с клавиатуры

        int a3 = 180- a1 - a2; // сумма углов в триугольнике 180 градусов
        System.out.println("3rd angle in triangle is: " + a3);
        }
        }

_____________________________________________________________
**2**

import java.util.Scanner;

public class Main {
public static void main (String[] args) {
System.out.println("Задачи на вычисления");
        // вычисление длины окружности и площади круга

        Scanner scanner = new Scanner(System.in); // включили Scanner
        System.out.println("Calculate length and area of circle"); // Bычисление длины окружности и площади круга

        System.out.println("Input radius of circle");
        double radius = scanner.nextDouble();
        double l = 2 * Math.PI * radius; // вычеслили длину окружности
        double s = Math.PI * radius * radius; // вычеслили площадь
        float s1 = (float) (Math.PI * Math.pow(radius, 2)); // вычеслили площадь cпособом

        System.out.println("Lenght of circle: " + l);
        System.out.println("Area of circle: " + s);
        System.out.println("Area of circle: " + s1);
        }
        }
______________________________________________________________

**5**

import java.util.Scanner;

public class Main {
public static void main (String[] args) {
System.out.println("Задачи на вычисления");
// ** 5 **

        Scanner scanner = new Scanner(System.in); // включили Scanner

        System.out.println("Input cost of City ticket per Month"); // ввести стоимость проездного на месяц
        double priceMonatskarte = scanner.nextDouble();

        System.out.println("Input number working days in current month: "); // количество рабочих дней в месяце
        int workingDays = scanner.nextInt();

        int trip = workingDays * 2; // количество поездок в рабочие дни
        int holydays = 31 - workingDays;

        int holydayTrip = (int) Math.round(1.5 * holydays); // количество поездок в выходные дни

        // trip = trip + holydayTrip; // так не очень хорошо - но можна
        int trips = 0; // общее количество поездок
        trips = trip + holydayTrip;

        System.out.println("Number of trip in May: : " + trips);

        double averageTripPrice = priceMonatskarte / trips; // вычисляем среднию стоимость

        System.out.println("Average price =  " + averageTripPrice);

        System.out.printf("Average price = %.2f " , averageTripPrice);
        System.out.println(); // Переход на новую строку
        }
        }

______________________________________________________________

** 3 - нахождение минимального и максимального из 2-х чисел

4 - вычисление площади треугольника по его основанию и высоте **

______________________________________________________________


if (d > 0) {
} else if (d == 0) {
} else { // d < 0

if (условие)
{
оператор1;
оператор2;
}
else
{
оператор1;
оператор2;
}

