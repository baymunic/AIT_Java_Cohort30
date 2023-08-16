package duplicates_in_array;

public class DuplicateArray {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {

        }
    }
    // Задача 2. Поиск дубликатов в массиве.
    // Задумайте массив из 100 элементов и заполните его случайными
    // значениями целых чисел в интервале от 1 до 10.
    // Подсчитайте сколько и каких элементов встретилось более одного раза в этом массиве.

    // Алгоритм:
    // Вар. 1 switch case по числам от 1 до 10. В каждом кейсе смотрим, сколько раз жоанное число попало в массив.
    // Вар. 2 внешний цикл запустить по числам от 1 до 10 и для каждого числа внутренним циклом посчитать, сколько раз
    // оно встретилось в массиве.
    // Вар 3. Объявить 10 счетчиков и для каждого из них в цикле понять, сколько раз число встерчалось в массиве.
    // Вар 4. Заполнить 2-х мерный массив x[][] - это на будущее.


    // метод заполняет массив и считает кол-во элементов массива
    public int displayArr(int[] arr) {
        int count = 0;
        int a = 100; // размер кол-во элементов
        int[] myArray = new int[a];
        for (int i = 0; i < a; i++) {
            myArray[i] = (int) (Math.random() * 10) + 1;//генерирует случайное число в диапазоне от 1 до 10.
            count++;
        }
        return count;
    }
    // в тесте можем проверить только значение count


    public void displayNumbers(int[] myArray) {
        System.out.println("Numbers: ");// Выводим массив на экран
        for (int arr : myArray) {  // это цикл "for each"
            System.out.print(arr + " | ");
        }
    }
    // этот метод НЕ-тестируемый

    // метод должен подсчитать кол-во раз нахождения числа а в массиве
    public int displayDuplicates(int[] myArray, int num) {
        int count = 0;
//        System.out.println("\nDuplicates:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                count++;
            }
        }
        return count;
    }
    // в тесте это метод должен подсчитать кол-во одинаковых элементов в тестовом массиве

}

/*
int[] num = new int[100];
        int a = 1, b = 10;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (b - a + 1) + a);//заполним элементы массива случайными натуральными числами
        }
        printArray(num);//вызываем метод и печатаем массив
        System.out.println();

            int count1= 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] == 1) {
                    count1 ++;
                }
            }
        System.out.println(count1);
 */