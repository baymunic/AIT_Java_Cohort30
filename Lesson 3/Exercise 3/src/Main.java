import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Добрый день !");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 5-и значное число: ");
        String num1 = br.readLine();
        System.out.println("Вы ввели " + num1);

        int n1 = Integer.parseInt(num1, 0,1,10);
        System.out.println("Первая цифра " + n1);

        int n2 = Integer.parseInt(num1, 1,2,10);
        System.out.println("Вторая цифра " + n2);

        int n3 = Integer.parseInt(num1, 2,3,10);
        System.out.println("Третья цифра " + n3);

        int n4 = Integer.parseInt(num1, 3,4,10);
        System.out.println("Четвёртая цифра " + n4);

        int n5 = Integer.parseInt(num1, 4,5,10);
        System.out.println("Пятая цифра " + n5);

        System.out.println("Удачи вам !");

    }

}
