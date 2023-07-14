import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
//Задача 10.1
//С клавиатуры вводятся N чисел. Составьте программу, которая определяет кол-во отрицательных,
// кол-во положительных и кол-во нулей среди введеных чисел. Значение N вводится с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of numbers: ");

        int n = scanner.nextInt(); // количество чисел

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int count = 0; // счётчик

        while (count < n) {
            count = count + 1;
            System.out.println("Input the number: ");
            int q = scanner.nextInt(); // вводимые числа

            if (q == 0) {
                zero++;
            }
            if (q < 0) {
                negative++;
            }
            if (q > 0) {
                positive++;
            }
        }
        System.out.println("You have: " + zero + " zero numbers");
        System.out.println("You have: " + negative + " negative numbers");
        System.out.println("You have: " + positive + " positive numbers");
    }
}

/* **Задача 2**
 Дополнить задачу о сумме углов треугольника контролем,
 что вводимые углы не больше 90 градусов.

 import java.util.Scanner;

 public class Main {
 public static void main(String[] args) {
 System.out.println("Input 3 angles of triangle: ");
 /*Задание 2: Дополнить задачу о сумме углов треугольника контролем,
 что вводимые углы не больше 90 градусов.*/

/*Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    String yes = "The triangle exist.";
    String no = "The triangle does not exists.";

        if (a == 0 | b == 0 | c == 0) {
                System.out.println(no);
                }
                else if (a > (b + c)) {
                System.out.println(no);
                }
                else if (b > (a + c)) {
                System.out.println(no);
                }
                else if (c > (a + b)) {
                System.out.println(no);
                }
                else if (a > 90) {
                System.out.println("Angle alpha is more than 90 degrees");
                }
                else if (b > 90) {
                System.out.println("Angle beta is more than 90 degrees");
                }
                else if (c > 90) {
                System.out.println("Angle gamma is more than 90 degrees");
                }
                else {
                System.out.println(yes);
                }
                System.out.println("Thank's and goodbye!");
                }
                } */