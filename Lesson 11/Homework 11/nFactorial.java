import java.util.Scanner;
public class nFactorial {
    public static void main(String[] args) {
        /* **Задача 2**
         Вводится n - натуральное число. Напишите метод, который получает на вход n
         и вычисляет n! = 1 * 2 * 3 *... * n (n факториал) 10! = 1 * 2 * 3 * ... * 10
         Вызовите полученный метод. При каком значении n происходит переполнение памяти,
         выделяемой для n типа int? */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your natural number: ");
        int num = scanner.nextInt();
        int digits = nFactorial(num);

        System.out.println("N factorial: " + digits);
    }
    public static int nFactorial (int n) {
        int i = 1;
        int fact = 1;

        while (i <= n){
              fact = fact * i;
           i++;
        }
        return fact;
    }
}
