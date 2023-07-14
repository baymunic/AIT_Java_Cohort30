import java.util.Scanner;
public class NumberRevers {
    public static void main(String[] args) {
        //Задача 3. Пользователь вводит натуральное число.
        // Распечатайте это число в обратном порядке.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer positive number: ");
        int n = scanner.nextInt();
        int digits = 0;
        int nd = n;

        while ( n < 0) {
            System.out.println("Wrong input! try again");
            n = scanner.nextInt(); // запрашиваем повторно ввод числа
        }
        // занесём цифры числа в массиве, а потом распечатаем его в обратном порядке
        // этот цикл считает количество цифр, вычисляем длину нужного нам массива
        while ( n > 0 ) {
            digits++;
            n = n / 10;
        }
        System.out.println(digits);

        int[] digit = new int [digits];  // задаём массив длинной сколько у нас есть цифр в числе n

        // в массив digit заносим цифры числа
        for (int i = 0; i < digit.length; i++) {
            digit[i] = nd % 10;  // остаток от деления на 10 - это и есть, например 567 : 10  => 756
            nd = nd / 10;   // уменьшение числа в 10 раз
        }
        printArray(digit);

        System.out.println();

        printArrayReverse(digit);
    }
    // -----methods-----

    public static void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i] + " | ");
        }
    }
    public static void printArrayReverse (int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" | " + arr[i] + " | ");
        }
    }  //-------end of methods--------
}
