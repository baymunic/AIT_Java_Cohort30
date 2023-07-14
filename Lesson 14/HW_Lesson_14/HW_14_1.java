public class HW_14_1 {
    public static void main(String[] args) {
        // Задача 1. Написать метод, принимающий массив целых чисел,
        // и возвращающий сумму всех его нечетных элементов (не индексы!, а сами элементы).
        // Массив на 100 элементов задать случайными числами в интервале от 1 до 100.
        // Задача 1. изменить код задач про:
        // сумма нечетных чисел в массиве
        // умножать числа с четными индексами в массиве так, чтобы использовались операторы break или continue.

        int[] num = new int[100];  // объявление массива
        int a = 1, b = 100;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(" " + num[i] + " ");
        }
        System.out.println();
        printOddNumbers(num);  // печатаем наш 1. метод

        System.out.println();
        sumOfEvenIndex(num);  // печатаем наш 2. метод возвращающий произведение всех его индексов
    }
    public static void printOddNumbers(int[] arr) {   //используем метод для выявления нечетных элементов и суммируем их
        int sumOdd = 0;      // задаём переменную для нечётных
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {   // вычисляем нечётные элементы
                continue;
            } else {
                sumOdd = sumOdd + arr[i]; // суммируем нечётные элементы
                System.out.print(": " + arr[i] + " " ); // выводим нечётные элементы
            }
            System.out.println();
        }
        System.out.println("Sum Odd numbers: " + sumOdd); // выводим сумму нечётных элементов
        System.out.println();
    }

    public static void sumOfEvenIndex (int[] arr) {  //используем метод возвращающий произведение всех его индексов
        int evenSum = 1;  // задаём переменную
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {   // вычисляем чётные индексы
                evenSum = evenSum * i;// умножаем чётные индексы
                continue;            // используем continue
            }
            System.out.print(evenSum); // выводим произведение чётных индексы
        }
    }
}


