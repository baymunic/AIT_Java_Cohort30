import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Задача о яблоках (начальное значение 30 яблок).
        //Запустить цикл, в котором яблоки беруться из корзины до тех пор,
        //пока они там есть. Последнее сообщение: "Яблоки кончились!".

        Scanner scanner = new Scanner(System.in);

        int apples = 30;
        int howManyApples;

        System.out.println("We have 30 apples in basket");

        while (apples > 0) {
            System.out.println("How many apples take from basket: ");
            howManyApples = scanner.nextInt();
            apples = apples - howManyApples;
            System.out.println("In basket left " + apples + " apples.");
        } // end of while

        System.out.println("Apples are finished. Basket is empty!");
    }
}
