public class Kredit {
    public static void main(String[] args) {
        /* **Задача 3**
        Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
        Через сколько лет его долг превысит s тысяч рублей,
        если за это время он не будет отдавать долг. */

        double m = 1000;   // размер ссуды
        double sumYears = KreditA(m); // вызываем метод
        System.out.println(sumYears);  // выводим результат
    }
    public static double KreditA (double x) {  // используем метод для вычисления
        double m = 1000;                       // 1-я переменная
        double s = 3000;                       // 2-я переменная
        double i = 0.1;                        // процент
        int years = 0;                         //
        do {                                   // используем do while
            m = m + m * i;                     // суммируем и умножаем на процент
            years++;                           // считает количество цифр
        } while (m <= s);                      // задаём условие
        return years;                           // возвращаем результат
    }
}