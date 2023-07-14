Задача 1
Вычислите площадь квадрата и объем куба со стороной а. Значение a запросить у пользователя.


import java.util.Scanner;

public class Main {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Считывание числа
        System.out.println("Введите значение а ");
        double a = sc.nextDouble(); 

        int pow2 = (int) Math.pow(a, 2); // возведение в степень
        System.out.println("Площадь квадрата: " + pow2);

        int pow3 = (int) Math.pow(a, 3); // возведение в степень
        System.out.println("Объем куба: " +pow3);

    }
}

Задача 2
Напишите приложение, которое переводит радианы в градусы.


import java.util.Scanner;

public class Main {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите радиану ");
        double r = sc.nextDouble();

        double r1 = r * (180/Math.PI);

        System.out.println("Составляет: " + r1 + " градусов");

    }
}

Задача 3
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю. Вычислите среднюю температуру за неделю и выведете ее на печать.


import java.util.Scanner;

public class Main {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите Первый день ");
        double d1 = sc.nextDouble();

        System.out.println("Введите второй день ");
        double d2 = sc.nextDouble();

        System.out.println("Введите Третий день ");
        double d3 = sc.nextDouble();

        System.out.println("Введите Четвёртый день ");
        double d4 = sc.nextDouble();

        System.out.println("Введите Пятый день ");
        double d5 = sc.nextDouble();

        System.out.println("Введите Шестой день ");
        double d6 = sc.nextDouble();

        System.out.println("Введите Седьмой день ");
        double d7 = sc.nextDouble();

        double dm = (d1 + d2 + d3 + d4 + d5 + d6 + d7) / 7;

        System.out.println("Средняя температура за неделю составляет: " + dm + " градусов");

    }
}

Задача 4
Пусть цена товара A обычно составляет 1000 евро, и товара B составляет 500 евро. 
Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку. 
Выведите на экран стоимость суммы A + B со скидкой. 
Отдельно выведите на экран абсолютную величину скидки для этой покупки.

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("Введите стоимость торара A: ");
        double d3 = sc.nextDouble();

        System.out.println("Введите стоимость торара В: ");
        double d4 = sc.nextDouble();

        double d5 = d3 + d4;

        double c1 = 0.1d;

        double c2 = d5 * c1;
        System.out.println("Сумма А + В со скидкой " + (d5 - c2));
        System.out.println("Абсалютная величина скидки " + c2);
    }
}

Задача 5 (*)
Сделайте расчет покупки товаров со скидками. 
Стоимость, количество товаров и скидку на них вводит пользователь. 
Товар А стоит X руб и на него скидка D%, 
а товар B стоит Y руб и на него скидка С%. 
Клиент взял N товаров A и M товаров B. 
Выведите итоговую стоимость покупки и полученной скидки.


import java.util.Scanner;

public class Main {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость товара А: ");
        double d1 = sc.nextDouble();
        System.out.println("Введите количество товара А: ");
        double d2 = sc.nextDouble();
        System.out.println("Введите скидку товара А в %: ");
        double d3 = sc.nextDouble();
        System.out.println("Введите стоимость товара В: ");
        double f1 = sc.nextDouble();
        System.out.println("Введите количество товара В: ");
        double f2 = sc.nextDouble();
        System.out.println("Введите скидку товара В в %: ");
        
        double f3 = sc.nextDouble();
        double d4 = d3 / 100;
        double d5 = d2 * (d1 * d4); // Rabatt
        double f4 = f3 / 100;
        double f5 = f2 * (f1 * f4); // Rabatt
        double g1 = d5 + f5;
        double g2 = (d1 * d2) + (f1 * f2) - g1;
        
        System.out.println("Итоговая стоимость покупки " + g2);
        System.out.println("Получинная скидка " + g1);
    }
}