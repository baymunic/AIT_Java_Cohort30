package HW_21;
import java.util.Scanner;

public class HW_String {
    public static void main(String[] args) {
        // Выполнить все упражнения, которые мы делали на занятии со строкой.
        // В качестве примера строки взять свое слово или короткое предложение,
        // например, "Меня зовут Имя и Фамилия".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string please!");

        String string = scanner.nextLine();

        System.out.println("String: " + string);
        String[] words = string.split(" "); // разделяем строку на слова, потому что разделителем является " " (пробел)
        int n = words.length;
        System.out.println("Quantity of words in the String: " + n);

        for (int i = 0; i < n; i++) {
            System.out.print(words[i] + " | ");
        }
        System.out.println();

        String[] symbols = string.split(""); // разделяем строку на символы, потому что разделителем является " " ()
        int m = symbols.length;
        System.out.println("Quantity of words in the String: " + m);

        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + " | ");
        }
    }
}


