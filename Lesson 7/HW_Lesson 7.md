**Задача 1**
Запросить у пользователя три стороны треугольника. 
Проверить выполнимость неравенства треугольника - 
любая из сторон должна быть меньше суммы двух других. 
Сообщить результат пользователю - 
существует или нет треугольник с введенными сторонами. 

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Input 3 numbers");
/*Задание 1: Запросить у пользователя три стороны треугольника.
Проверить выполнимость неравенства треугольника -
любая из сторон должна быть меньше суммы двух других.
Сообщить результат пользователю -
существует или нет треугольник с введенными сторонами.*/

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String yes = "The triangle exist.";
        String no = "The triangle does not exists.";

        if (a == 0 | b == 0 | c == 0) {
            System.out.println(no);
        }
        else if (a > (b + c)) {
            System.out.println(no);
        }
        else if (b > (a + c)) {
            System.out.println(no);
        }
        else if (c > (a + b)) {
            System.out.println(no);
        }
        else {
            System.out.println(yes);
        }
        System.out.println("Thank's and goodbye!");
    }
}

___________________________________________________________

**Задача 2**
Дополнить задачу о сумме углов треугольника контролем, 
что вводимые углы не больше 90 градусов.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Input 3 angles of triangle: ");
/*Задание 2: Дополнить задачу о сумме углов треугольника контролем,
что вводимые углы не больше 90 градусов.*/

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String yes = "The triangle exist.";
        String no = "The triangle does not exists.";

        if (a == 0 | b == 0 | c == 0) {
            System.out.println(no);
        }
        else if (a > (b + c)) {
            System.out.println(no);
        }
        else if (b > (a + c)) {
            System.out.println(no);
        }
        else if (c > (a + b)) {
            System.out.println(no);
        }
        else if (a > 90) {
            System.out.println("Angle alpha is more than 90 degrees");
        }
        else if (b > 90) {
            System.out.println("Angle beta is more than 90 degrees");
        }
        else if (c > 90) {
            System.out.println("Angle gamma is more than 90 degrees");
        }
        else {
            System.out.println(yes);
        }
        System.out.println("Thank's and goodbye!");
    }
}

_____________________________________________________________________

**Задача 3**

Сделайте расчет покупки товаров со скидками. Стоимость, 
количество товаров и скидку на них вводит пользователь. 
Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб 
и на него скидка С%. Клиент взял N товаров A и M товаров B. 
Программа не должна допускать ввода отрицательных чисел. 
Выведите итоговую стоимость покупки и полученной скидки.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Input year number: ");
/*Задание 3: Сделайте расчет покупки товаров со скидками. Стоимость,
количество товаров и скидку на них вводит пользователь.
Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб
и на него скидка С%. Клиент взял N товаров A и M товаров B.
Программа не должна допускать ввода отрицательных чисел.
Выведите итоговую стоимость покупки и полученной скидки.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите стоимость товара A: ");
        double x = sc.nextDouble();
        System.out.println("Введите количество товаров А: ");
        double y = sc.nextDouble();
        System.out.println("Введите скидку товара А: ");
        double z = sc.nextDouble();

        System.out.println("Введите стоимость товара В: ");
        double x1 = sc.nextDouble();
        System.out.println("Введите количество товаров В: ");
        double y1 = sc.nextDouble();
        System.out.println("Введите скидку товара В: ");
        double z1 = sc.nextDouble();

        double sum = (x * y) + (x1 * y1); // Total amount of goods
        double discountA = (x * y) * (z / 100); // Product discount A
        double discountB = (x1 * y1) * (z1 / 100); // Product discount B

        if (x < 0 | y < 0 | z < 0 | x1 < 0 | y1 < 0 | z1 < 0) {
            System.out.println("Please enter a positive number !!!");
        } else {
            System.out.println("Total purchase price is: " + (sum - discountA - discountB));
            System.out.println("Final discount is: " + (discountA + discountB));
        }
    }
}

_____________________________________________________________________

**Задача 4 (*)**
Написать программу, определяющую является ли год високосным. 
Для того, чтобы быть високосным год должен: делится без остатка на 4 
и либо не должен делится без остатка на 100 либо если он делится на 100, 
то он должен делится также на 400.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Input year number: ");
/*Задание 4: Написать программу, определяющую является ли год високосным.
Для того, чтобы быть високосным год должен: делится без остатка на 4
и либо не должен делится без остатка на 100 либо если он делится на 100,
то он должен делится также на 400..*/

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        String yes = "It's a leap year";
        String no = "It's a common year";

        if (year % 400 == 0) {
            System.out.println(yes);
        } else if (year % 4 == 0 & year % 100 != 0) {
            System.out.println(yes);
        } else {
                System.out.println(no);
            }

        }
}