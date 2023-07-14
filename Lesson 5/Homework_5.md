**Задача 1**
Вычислите гипотенузу по двум катетам. 
Длину катетов запросите у пользователя. 
Теорема Пифагора. Math.sqrt();
// (3, 4, 5)(5, 12, 13)(7, 24, 25)
(20, 21, 29)(12, 35, 37)(28, 45, 53)
(11, 60, 61)(16, 63, 65)(48, 55, 73)
(13, 84, 85)(36, 77, 85)(65, 72, 97)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = in.nextInt();
        System.out.print("Введите второе число: ");
        int y = in.nextInt();

        System.out.println("Введенные Вами числа: " + x + " и " + y);
        int x1 = (int) Math.pow(x, 2);
        int y1 = (int) Math.pow(y, 2);
        int z = (int) Math.sqrt(x1 + y1);
        // double z = Math.sqrt(x1 + y1); // Второй вариант

        System.out.println("Гипотенуза будет: " + z);
    }
}

**Задача 2**
Написать программу для перевода градусов по Фаренгейту в шкалу Цельсия. 
Формула для перевода С = 5*(F-32)/9. 
Запросить у пользователя темпаратуру.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите градусы Фаренгейта: ");
        int f = in.nextInt();

        //System.out.print("Введите градусы Цельсия: ");
        //int ce = in.nextInt();

        double c = 5*(f -32)/9; // Формула перевода Фаренгейта в Цельсия
       //double c1 = ce*1.8+32; // Формула перевода Цельсия в Фаренгейт

        System.out.println("Это составит : " + c + " градусов Цельсия");
       //System.out.println("Это составит : " + c1 + " градусов Фаренгейта");

    }
}

**Задача 3**
Вычислите площадь треугольника по формуле Герона: 
p = (a + b + с)/2; S = sqrt(p*(p-a)(p-b)(p-c));

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        System.out.println("Введенные Вами числа: = " + a + " = " + b + " = " + c);

        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Периметр треугольника = " + p);
        System.out.println("Площадь треугольника = " + s);

    }
}


**Задача 4**
Напишите приложение для решения квадратного уравнения, 
корни уравнения ищутся по коэффициентам a, b и с. 
Коэффициенты запросить у пользователя.
** ax^2+bx+c=0 **

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Программа решает квадратное уравнение вида: ");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");

        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double pow = Math.pow(b, 2);
        double d = pow - 4 * a * c; // Вычисляем дискриминант по формуле: b^2-4ac;

        if (d > 0) {
            double x1, x2;  // Если дискриминант больше нуля, то вычислим корни уравнения x1 и x2
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;  // Если дискриминант равен нулю, значит уравнение имеет единственный корень
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}