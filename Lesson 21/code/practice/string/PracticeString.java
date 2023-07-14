package practice.string;

import java.util.Arrays;

public class PracticeString {
    public static void main(String[] args) {

        String str = "I love JAVA very strong!";

        System.out.println("String: " + str);
        String[] words = str.split(" "); // разделяем строку на слова, потому что разделителем является " " (пробел)
        int n = words.length;
        System.out.println("Quantity of words in the String: " + n);

        for (int i = 0; i < n; i++) {
            System.out.print(words[i] + " | ");
        }
        System.out.println();

        String[] symbols = str.split(""); // разделяем строку на символы, потому что разделителем является " " ()
        int m = symbols.length;
        System.out.println("Quantity of words in the String: " + m);

        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + " | ");
        }
    }
}
