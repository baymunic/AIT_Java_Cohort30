public class Exercise_13_2 {
    public static void main(String[] args) {
        // Задача 2. Написать метод, принимающий массив целых чисел,
        // и возвращающий произведение всех его элементов, с четными индексами.
        // 0 - тоже четное число.

        int[] num = new int[100];
        int a = 1, b = 100;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printOddNumbers(num);  // печатаем наш метод
    }
    public static void printOddNumbers(int[] arr) {   //используем метод для выявления четных элементов
        int sumEven = 0;     //  задаём переменную для чётных
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
            } else {                  // вычисляем чётные элементы
                System.out.println("Even number: " + arr[i]);
                sumEven = sumEven + arr[i]; // суммируем их
                sumEven++;                 // выводим чётные элементы
            }
        }
    }
}


