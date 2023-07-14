**Задача 1**

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
/*Задача 8.1: Пользователь вводит с клавиатуры число.
Вывести абсолютное значение (модуль) числа, используя тернарный оператор.*/
Scanner scanner = new Scanner(System.in);
System.out.println("Input the number please: ");

        int num = scanner.nextInt();

        String securityAnswer = (num >= 0) ? "Module of your number is " + num
                : "Module of your number is " + (- num);
        System.out.println(securityAnswer);
    }
}

_____________________________________________________________________________
**Задача 2**

import java.util.Scanner;
public class Main {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        /*Задача 8.2: Используя оператор switch ... case написать бот,
         который помогает выбрасывать мусор в баки разных цветов:
         + упаковки в желтый бак
         + пищевые отходы в коричневый бак
         + бумага в зеленый бак
         + прочие отходы в черный бак.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sort your waste: package, food, paper, other");
        String operation = scanner.next();

        switch (operation) {
            case "package": {
                System.out.println(ANSI_YELLOW + "Your package waste go in yellow container: " + ANSI_RESET);
                break;
            }
            case "food": {
                System.out.println(ANSI_RED + "Your food waste go in red container: " + ANSI_RESET);
                break;
            }
            case "paper": {
                System.out.println(ANSI_GREEN + "Your paper waste go in green container: " + ANSI_RESET);
                break;
            }
            case "other" : {
                System.out.println(ANSI_BLACK + "Your other waste go in black container: " + ANSI_RESET);
                break;
            }
            default : {
                System.out.println("Wrong input!");
            }
        } 
    }
}

____________________________________________________________________________
**Задача 3**

import java.io.*;
public class Main {
public static void main(String[] args) throws IOException {
/*Задача 8.3: Написать программу, в которую пользователь вводит
имя и фамилию в одну строку через пробел. Программа должна выводить
имя и фамилию на разных строках. Первая буква имени и фамилии должны
быть большими не зависимо от того, как их ввел пользователь,
лишние пробелы должны быть удалены. (повторение методов String)*/
System.out.println("Добрый день !");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите ваше Имя и Фамилию: ");
        String name = br.readLine();
        System.out.println("Вы ввели : " + name);

        name = name.trim(); // отсекли случайные пробелы в начале и в конце
        int l = name.length();

        int spaceIndex = name.indexOf(" "); // нашли номер позиции 1-й точки
        System.out.println(spaceIndex);

        String firstName = name.substring(0, spaceIndex);
        System.out.println(firstName); // преобразование строки в число

        String secondName = name.substring(spaceIndex + 1, l);
        System.out.println(secondName); // преобразование строки в число
    }
}

____________________________________________________________________________

**Задача 4**

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
System.out.println("Calculator");
/*Задача 8.4 (*): В задаче про калькулятор все действия оформить методами.
Если вводятся целые числа, то вычислять целочисленное частное и остаток от деления.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        int x = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int y = scanner.nextInt();
        System.out.println("Choose operation: +, -, *, /");

        String operation = scanner.next();

        switch (operation) {
            case "+": {
                int sum = add(x, y);
                System.out.println("Sum is: " + sum);
                break;
            }
            case "-": {
                int Subtraction = diff(x, y);
                System.out.println("Subtraction is: " + Subtraction);
                break;
            }
            case "*": {
                int Multiplication = multiply(x, y);
                System.out.println("Multiplication is: " + Multiplication);
                break;
            }
            case "/" : {
               if ((x & y) != 0) {
                   double div = div(x, y);
                   double mod = rest(x, y);
                   System.out.println("Division is: " + div);
                   System.out.println("Rest of division is: " + mod);
               } else {
                   System.out.println("Error: division by zero is not allowed");
               }
               break;
               }
            default : {
                System.out.println("Wrong input!");
            }
        }

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int diff(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double div(int a, int b) {
        return a / b;
    }
    public static int rest(int a, int b) {
        return a % b;
    }
}