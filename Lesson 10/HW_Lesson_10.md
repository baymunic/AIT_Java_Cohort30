**Задача 1**
С клавиатуры вводятся N чисел. Составьте программу, которая определяет кол-во отрицательных, 
кол-во положительных и кол-во нулей среди введеных чисел. Значение N вводится с клавиатуры.

import java.util.Scanner;
public class Main1 {
public static void main(String[] args) {
//Задача 10.1
//С клавиатуры вводятся N чисел. Составьте программу, которая определяет кол-во отрицательных,
// кол-во положительных и кол-во нулей среди введеных чисел. Значение N вводится с клавиатуры.
Scanner scanner = new Scanner(System.in);
System.out.println("Input number of numbers: ");

        int n = scanner.nextInt(); // количество чисел

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int count = 0; // счётчик

        while (count < n) {
            count = count + 1;
            System.out.println("Input the number: ");
            int q = scanner.nextInt(); // вводимые числа

            if (q == 0) {
                zero++;
            }
            if (q < 0) {
                negative++;
            }
            if (q > 0) {
                positive++;
            }
        }
        System.out.println("You have: " + zero + " zero numbers");
        System.out.println("You have: " + negative + " negative numbers");
        System.out.println("You have: " + positive + " positive numbers");
    }
}

_________________________________________________________________________

**Задача 2**
В сберкассу на трёхпроцентный вклад положили S рублей. 
Какой станет сумма вклада через N лет?

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
System.out.println("Сберкасса");
/*Задача 10.2
В сберкассу на трёхпроцентный вклад положили S рублей. Какой станет сумма вклада через N лет?*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму первоначального вклада: ");

        double s = scanner.nextDouble(); // сумма вклада

        System.out.println("Введите длительность вашего вклада (в годах): ?");

        double n = scanner.nextDouble(); // количество лет

        int i = 0; // счетчик
//       double finalAmount = 1;

        while (i < n) { // пока наш вклад меньше, чем требуется
            s = s + (s * 0.03);
//            System.out.println(s);
            i++;
}
            System.out.println(s);
}
}

_________________________________________________________________________________

**Задача 10.3**
Написать метод, определяющий максимум из трех натуральных чисел. 
Числа вводит пользователь с клавиатуры. 
Метод должен быть защищен от ввода отрицательных чисел. - ЭТО ПОКА МОЖНО НЕ ДЕЛАТЬ

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Input 3 natural numbers: "); // запрашиваем ввод 3 натуральных числа
/*Задача 10.3*
Написать метод, определяющий максимум из трех натуральных чисел.
Числа вводит пользователь с клавиатуры.
Метод должен быть защищен от ввода отрицательных чисел. - ЭТО ПОКА МОЖНО НЕ ДЕЛАТЬ*/

        Scanner sc = new Scanner(System.in);  // вводим 3 натуральных числа
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 0 | b < 0 | c < 0) {           // защита от ввода отрицательных чисел
            System.out.println("You entered negative numbers, please repeat your Input: ");
            System.exit(0);
        } else maxXYZ(a, b, c);                // используем подготовленный метод
        int maxValue = maxXYZ(a, b, c);
        System.out.println("Max from " + a + ", " + b + ", " + c + " is: " + maxValue);
    }
    public static int maxXYZ (int x, int y, int z) { // метод для выявления максимального числа из 3-х чисел
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

________________________________________________________________________________
**Задача 10.4(*)**
Написать программу, которая принимает с клавиатуры номер месяца и год
и выводит на экран название месяца и количество дней в нем. (повторение условного оператора)

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Day & Month information: ");
/*Задача 10.4(*)
Написать программу, которая принимает с клавиатуры номер месяца и год
и выводит на экран название месяца и количество дней в нем. (повторение условного оператора)*/

        Scanner sc = new Scanner(System.in);  // вводим 3 натуральных числа

        System.out.println("Input the number of month: ");
        int month = sc.nextInt();

        System.out.println("Input the year: ");
        int year = sc.nextInt();

        String monthN;
        int days;

        switch (month) {
            case 1: {
                monthN = "January";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 2: {
                monthN = "February";
                if (leapYear(year)) {
                    days = 29;
                }else {
                    days = 28;
                }
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 3: {
                monthN = "March";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 4: {
                monthN = "April";
                days = 30;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 5: {
                monthN = "May";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 6: {
                monthN = "June";
                days = 30;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 7: {
                monthN = "July";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 8: {
                monthN = "August";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 9: {
                monthN = "September";
                days = 30;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 10: {
                monthN = "October";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 11: {
                monthN = "November";
                days = 30;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;

            }
            case 12: {
                monthN = "December";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;

            }
            default : {
                monthN = "Wrong month name";
                days = 0;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                System.out.println("Wrong input!");

            }

        }
    }
    public static boolean leapYear(int year) {
        return (year % 4 == 0 & year % 100 != 0) || (year % 400 == 0);
    }
}