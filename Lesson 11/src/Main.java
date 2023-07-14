import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Сберкасса");
/*Задача 10.2
В сберкассу на трёхпроцентный вклад положили S рублей. Какой станет сумма вклада через N лет?*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму первоначального вклада: ");

        double s = scanner.nextDouble(); // сумма вклада

        System.out.println("Введите длительность вашего вклада (в годах): ?");

        double n = scanner.nextDouble(); // количество лет

        int i = 0; // счетчик

        while (i < n) { // пока наш вклад меньше, чем требуется
            s = s + (s * 0.03);
            i++;
        }
        System.out.println(s);
    }
}