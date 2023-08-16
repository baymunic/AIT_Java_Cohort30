package HW_27;
import java.util.Arrays;
public class FindDublicatesInArray_v2 {

        public static void main(String[] args) {
            int[] array = new int[100];
            // Заполнение массива случайными значениями от 1 до 10
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10) + 1;
            }

            // Сортируем массив для удобства поиска дубликатов
            Arrays.sort(array);

            // Подсчет и вывод результатов
            System.out.println("Встретилось более одного раза:");
            int count = 1;
            boolean foundDuplicate = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1]) {
                    count++;
                    foundDuplicate = true;
                } else {
                    if (foundDuplicate) {
                        System.out.println(array[i - 1] + " встретилось " + count + " раз(а).");
                    }
                    count = 1;
                    foundDuplicate = false;
                }
            }

            // Проверка последнего элемента
            if (foundDuplicate) {
                System.out.println(array[array.length - 1] + " встретилось " + count + " раз(а).");
        }
    }
}
/*
В этом коде мы используем одномерный массив для хранения случайных чисел.
Сначала мы создаем массив array из 100 элементов и заполняем его случайными значениями от 1 до 10.

Затем мы сортируем массив с помощью метода Arrays.sort(),
чтобы дубликаты оказались рядом друг с другом и было проще их обнаружить.

После сортировки мы проходим по отсортированному массиву
и подсчитываем количество повторений каждого элемента,
выводя результаты только для элементов, встречающихся более одного раза.
Для этого мы используем переменные count, foundDuplicate, и проверяем текущий элемент с предыдущим.

В результате, вы увидите список элементов,
которые встречаются более одного раза, и сколько раз они встречаются.
 */

