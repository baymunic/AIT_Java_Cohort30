import java.util.Scanner;
public class Exercise_13_3 {
    public static void main(String[] args) {
        //Задача 3. Пользователь вводит строку. 
        // Распечатайте эту строку в обратном порядке.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your String: "); // запрашиваем строку
        String inputString = scanner.nextLine();   // вводим строку

        String reversedString = new StringBuffer(inputString).reverse().toString(); // переворачиваем строку
        System.out.println(reversedString);   // выводи результат
    }
}
