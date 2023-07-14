
public class hmSUM {
    public static void main(String[] args) {
        // sum = 1 + 1/2 + 1/3 + ... + 1/10

        long n = 10;  // начальное данное к задаче

        // задаём данные
        System.out.println("Sum is: " + sumOfFraction(n));
    }
    // ----------Methods----------
    public static double sumOfFraction (double n) {
            double i = 1;
            double sum = 0;

            // начинаем цикл
            while ( i <= n ) {   // пока параметр цикла i меньше n
                sum = sum + 1/i; // накапливаем сумму
                i++;             // увеличиваем параметр цикла
            }
            return sum;
        }
    // -------end of methods-------
    }


