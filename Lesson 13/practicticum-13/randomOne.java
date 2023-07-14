import java.util.Scanner;

public class randomOne {
    public static void main(String[] args) {
        //Задача 2. Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
        // Запросите у пользователя какое-то натуральное число. Определите, есть ли это число в массиве.
        // Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
        // а возвращает ответ - нашлось ли это число в массиве.

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];
        int a = 1, b = 100;

        for (int i = 0; i < num.length; i++) {
            // заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(num); // вызываем метод и печатаем массив


        System.out.println();
        System.out.println("Input number for search (integer and positive): ");
        int n = scanner.nextInt();

        while ( n < 0) {
            System.out.println("Wrong input! try again");
            n = scanner.nextInt(); // запрашиваем повторно ввод числа
        }

        // вызов метода поиска и печать результата

        searchInArray(num, n);

        if (searchInArray(num, n)) {
            System.out.println(" We find the number | Index is = " + searchIndexInArray(num, n));
        }else {
            System.out.println(" We didn't found the number! | Index is = " + searchIndexInArray(num, n));
        }
    }
    // -----Methods-----

    public static int searchIndexInArray (int[] x, int y) {   // это num, и n
        int index = -1;
        for (int i = 0; i < x.length; i++) {   //num.length
            // проверяем, что в массиве есть искомое число
            if (y == x[i]) {
                index = i; // когда он нашёлся то ищем index i
                return index;  // это index найденного числа
            }
        }
        return index;
    }

    public static boolean searchInArray (int[] x, int y) {   // это num, и n
        boolean res = false;
        for (int i = 0; i < x.length; i++) {   //num.length
            // проверяем, что в массиве есть искомое число
            if (y == x[i]) {
                res = true;
            }
        }
        return res;
    }

    public static void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i] + " | ");
        }
    }   // -----end of methods------
}
