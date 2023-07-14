import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Добрый день!");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число: ");
        String num1 = br.readLine();
        System.out.println("Вы ввели " + num1 + " - это первое число");
        int n1 = Integer.parseInt(num1);

        System.out.println("Введите второе число: ");
        String num2 = br.readLine();
        System.out.println("Вы ввели " + num2 + " - это второе число");
        int n2 = Integer.parseInt(num2);

        System.out.println("Результат:  " + " Периметр будет " + (2*(n1 + n2)));
        System.out.println("Результат:  " + " Площадь  будет " + (n1 * n2));
        System.out.println("Спасибо!");
    }
}


