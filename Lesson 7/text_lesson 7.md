import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("If - else practice");
/*Задание 1: Проверка четное или нечетное,
положительное или отрицательное введенное пользователем число.
Проверка возраста собеседника, возраст запросить у пользователя.
Если пользователю нет 18 лет, то сообщить "Вам надо получить общее среднее образование",
иначе - спросить дату дня рождения и вывести ее на экран.*/

        Scanner sc = new Scanner(System.in); // Switch on Scanner

        System.out.println("Input number, pls: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number " + number + " is even."); // message for user
            } else {
            System.out.println("This number " + number + " is odd.");  // message for user
            }
        }
}

____________________________________________________________

