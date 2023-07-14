import java.util.Scanner;
public class Apples {
    public static void main(String[] args) {
        /*Задача 1. Задача о яблоках (начальное значение 30 яблок).
        Запустить цикл, в котором яблоки берутся из корзины до тех пор,
        пока они там есть. Последнее сообщение: "Яблоки кончились!".*/

        Scanner scanner = new Scanner(System.in);
        int howManyApples;

        int apples = 30;
        System.out.println("We have 30 apples in basket");

        while (apples > 0) {
            System.out.println("How many apples take from basket: ");
            howManyApples = scanner.nextInt();
            apples = apples - howManyApples; // apples--;
            System.out.println("In basket left " + apples + " apples");
        } // End of while
        System.out.println("Basket is empty!");
    }
}
/*
* **Алгоритм запуска цикла:**
Шаг 1. Задаем переменную (счетчик, параметр) цикла;
Шаг 2. Определить условие повторения цикла;
Шаг 3. Заполнить тело цикла необходимыми операторами;
Шаг 4. Изменить переменную (счетчик, параметр) цикла;
Шаг 5. Запустить цикл и проверить его работу на крайних значениях и в целом.*/