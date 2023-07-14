import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Пользователь вводит положительное целое число.
//        Найдите сумму его цифр.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number");

        int n = scanner.nextInt();

        System.out.println("Your number is: " + n);

        int l;
        String string1 = n.length();
        int pointer = 0; // чальное значение

        while ( l > 0 ) { // пока частное больше 0
            System.out.println(n.charAt(pointer));
            pointer++;
            System.out.println(pointer);
        }

    }
}

/*
* **Алгоритм запуска цикла:**
Шаг 1. Задаем переменную (счетчик, параметр) цикла;
Шаг 2. Определить условие повторения цикла;
Шаг 3. Заполнить тело цикла необходимыми операторами;
Шаг 4. Изменить переменную (счетчик, параметр) цикла;
Шаг 5. Запустить цикл и проверить его работу на крайних значениях и в целом.*/