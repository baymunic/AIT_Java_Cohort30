package HW_27;
// Задача 2. Поиск дубликатов в массиве. Задумайте массив из 100 элементов
// и заполните его случайными значениями целых чисел в интервале от 1 до 10.
// Подсчитайте сколько и каких элементов встретилось более одного раза в этом массиве.

import java.util.HashMap;
import java.util.Map;
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        // Заполнение массива случайными значениями от 1 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        // Подсчет количества повторений каждого элемента в массиве
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Вывод результатов
        System.out.println("Встретилось более одного раза:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " встретилось " + entry.getValue() + " раз(а).");
            }
        }
    }
}
/*
В этом коде мы используем HashMap для подсчета повторений каждого элемента в массиве. Сначала мы создаем массив array из 100 элементов и заполняем его случайными значениями от 1 до 10.

Затем мы создаем HashMap с ключами типа Integer и значениями типа Integer, чтобы подсчитать количество повторений каждого элемента. Мы проходимся по массиву и для каждого числа увеличиваем его количество повторений в HashMap.

Наконец, мы выводим результаты, печатая элементы, которые встречаются более одного раза в массиве и сколько раз они встречаются.
 */