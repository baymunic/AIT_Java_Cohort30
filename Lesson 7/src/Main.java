import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input 3 angles of triangle: ");
/*Задание 2: Дополнить задачу о сумме углов треугольника контролем,
что вводимые углы не больше 90 градусов.*/

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String yes = "The triangle exist.";
        String no = "The triangle does not exists.";

        if (a == 0 | b == 0 | c == 0) {
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
}
