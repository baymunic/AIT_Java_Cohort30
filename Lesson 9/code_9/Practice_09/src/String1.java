import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        // Задача 5. Пользователь вводит строку.
        // Распечатайте каждую букву строки на новой строчке.

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("String is: " + s);

        int l = s.length(); // определили длину введённой строки
        int pointer = 0;
        System.out.println("Length of string is: " + l);

        while (l > 0) {
            System.out.println(s.charAt(pointer));
            l--; // уменьшаем длину строки
            pointer++; // двигаем указатель по длине в право
        }
        System.out.println(pointer);
    }
}
