public class FindElementInArray {
    public static void main(String[] args) {
        //Задача 2. Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
        // Найдите минимальный элемент массива и его индекс.

        System.out.println("Find: ");

        int[] numbers = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59}; // суть его, array, numbers, num
        int min = numbers[0]; // в качестве минимума пока временно назначили 1-й элемент массива (под индексом 0)
        int pointer = -1;     // это значит, что пока такого элемента еще не нашли

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];  // находим минимальный элемент
                pointer = i;       // сохраняем его номер в переменной pointer
            }
        }
        System.out.println("Min = " + min + " Index of min= " + pointer);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " | ");
        }
    }
}