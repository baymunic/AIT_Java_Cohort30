import java.util.Scanner;

public class Main3_square_equation {
    public static void main(String[] args) {
        System.out.println("If - else practice - square equation");
        /*Задание 4: Решение квадратного уравнения по коэффициентам квадратного трехчлена а, b и с.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st coefficient");
        int a = sc.nextInt();
        System.out.println("Input 2nd coefficient");
        int b = sc.nextInt();
        System.out.println("Input 3rd coefficient");
        int c = sc.nextInt();

        int d = b * b - 4 * a * c; // calculate discriminant

        if (d < 0) {
            System.out.println("There are no roots. d is negative " + d);
        }
        else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        System.out.println("Thank's and goodbye!");
        }
}