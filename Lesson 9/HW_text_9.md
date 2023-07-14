**Задача 9.1**

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
//Задача 1: Программа получает на вход строку и число повторений этой строки.
//Программа должна вывести эту строку нужное количество раз.

        System.out.println("Input your string: ");

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int count_down = scanner.nextInt();        // параметр (счётчик) цикла

        while (count_down > 0) {
            count_down--;                          // изменяем параметр цикла
            System.out.println(string);
        }                                          //  end of while
        System.out.println("Finish!");
    }                                              // end method main
}                                                  // end of class

_________________________________________________________

**Задача 9.2**

import java.io.*;
public class Main {
public static void main(String[] args) throws IOException {
//        Задача 9.2: Пользователь вводит положительное целое число.
//        Найдите сумму его цифр.
System.out.println("Добрый день !");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите положительное целое число из 6 цифр: ");
        String num1 = br.readLine();
        System.out.println("Вы ввели " + num1);

        int n1 = Integer.parseInt(num1, 0,1,10);
        int n2 = Integer.parseInt(num1, 1,2,10);
        int n3 = Integer.parseInt(num1, 2,3,10);
        int n4 = Integer.parseInt(num1, 3,4,10);
        int n5 = Integer.parseInt(num1, 4,5,10);
        int n6 = Integer.parseInt(num1, 5,6,10);
        System.out.println("Сумма всех цифр = " + (n1 + n2 + n3 + n4 + n5 + n6));
    }
}

**9.2 Second**

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Sum of digits");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0){ // крутить цикл пока num не приобретёт значение 0
            sum = sum + num % 10;  // += (num % 10);  e.g. num = 12, находим остаток от деления 12 на 10 = 2, плюсуем вычисленное 2 в сумму
            num = num / 10; // делим 12 на 10 получаем 1,
            // 1 не равно 0, значит запускаем цикл ещё раз.
            // в прошлый раз num = 12, во второй раз при прокручивании цикла num = 1.
            // находим остаток от деления 1 на 10 = 1. довольно забавный закон математики
            // прибавляем вычисленное 1 к 2 (значение sum увеличилось за прошлый цикл)
            // делим 1 на 10 = 0
            // из-за предыдущего действия наш num = 0, а значит значение нашего while false, а значит цикл завершён и программа двигает вниз
            // значение sum из заданного ранее 0 становится тем, которое мы вычислили в цикле
            // num при дальнейшем выводе будет 0
        }
        System.out.println("Сумма цифр Вашего числа: " + sum);

    }
}

_________________________________________________________

**Задача 9.3**

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
/*В первый день спортсмен пробежал s километров,
а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
Определите номер дня, на который пробег спортсмена составит не менее target километров.
Программа получает на вход действительные числа s и target
и должна вывести одно натуральное число.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input - how many KM did you ran in your first day: ");

        double distancce = scanner.nextDouble();
        System.out.println("Input - how many KM you wanna ran? ");

        double target = scanner.nextDouble();
        System.out.println("Your wanna run: " + target + " KM");

        int dayCount = 1;

        while (distancce < target) { // пока пробегаемая дистанция меньше, чем день
            distancce = distancce + distancce * 0.1; // distance *= 1.1
            dayCount = dayCount + 1; // dayCount++
            System.out.println(distancce);
        }
        System.out.println("You run: " + dayCount + " days");
    }
}

/*      **Алгоритм запуска цикла:**
Шаг 1. Задаем переменную (счетчик, параметр) цикла;
Шаг 2. Определить условие повторения цикла;
Шаг 3. Заполнить тело цикла необходимыми операторами;
Шаг 4. Изменить переменную (счетчик, параметр) цикла;
Шаг 5. Запустить цикл и проверить его работу на крайних значениях и в целом.*/