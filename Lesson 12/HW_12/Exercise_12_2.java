public class Exercise_12_2 {
    public static void main(String[] args) {
        // Задача 2:
        // Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        // Найдите максимальный элемент массива и его индекс.

        System.out.println("Найдите максимальный элемент массива и его индекс: ");

        int[] numbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38}; // элементы массива
        int max = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("Max element is: " + max);
        System.out.println("Index is: " + index);
    }
}