public class Power3 {
    public static void main(String[] args) {
        // Задача 3. Возведите 3 в степень 10,
        // выведите все промежуточные результаты.

        int power = 1;
        int result = 1;


        do {
            result = result * 3; // возведение в степень
            power++; // меняем счётчик (параметр) цикла
            System.out.println(result);
        } while (power <= 10);
    }
}
