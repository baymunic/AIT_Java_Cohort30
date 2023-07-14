public class Exercise_12_1 {
    public static void main(String[] args) {
        /* **Задача 1**
        Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
        Выведите на печать температуру, которая была во вторник и затем в четверг.
        Найти среднюю температуру за прошлую неделю. */

        System.out.println("Temperature in my City");
        double[] temperature = {24.2,    25.1,    24.3,    28.7,    26.2,    23.9,    22.5};
        double result = 0;

        System.out.println(temperature);  // так распечатается ссылка в памяти на массив

        // распечатываем весь массив
        for (double i : temperature) {  // задаём условие
            result +=i;    // находим среднюю температуру за прошлую неделю
        }
        System.out.println();
        System.out.println("=============================");
        System.out.println("Cредняя температура за прошлую неделю составляет: " + result / temperature.length);
        System.out.println("=============================");
        System.out.println("Вторник: " + temperature[1] + " / Четверг: " + temperature[3]);
    }
}