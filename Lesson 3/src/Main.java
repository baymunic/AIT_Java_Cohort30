import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Добрый день!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Сколько у вас машин? : ");
        String num1 = br.readLine();
        System.out.println("Вы ввели " + num1 + " - это число машин  в наличие "); // Это сообщение пользователю
        int n1 = Integer.parseInt(num1);

        System.out.println("Сколько колёс у ваших  машин? : ");
        String num2 = br.readLine();
        System.out.println("Вы ввели " + num2 + " - это число колёс у ваших  машин");
        int n2 = Integer.parseInt(num2);

        System.out.println("Сколько тормозных колодок на каждом колесе? : ");
        String num3 = br.readLine();
        System.out.println("Вы ввели " + num3 + " - это число тормозных колодок на каждом колесе");
        int n3 = Integer.parseInt(num3);

        System.out.println(" Количество машин  " + n1 + " Количество колёс " + n2 + " Количество тормозных колодок на каждом колесе " + n3 + " получилось " + (n1 * n3 * n2) + " Деталей " );
        System.out.println("Спасибо!");
    }
}
