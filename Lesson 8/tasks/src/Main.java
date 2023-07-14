import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator");
        /*Задача 8.4 (*): В задаче про калькулятор все действия оформить методами.
        Если вводятся целые числа, то вычислять целочисленное частное и остаток от деления.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        int x = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int y = scanner.nextInt();
        System.out.println("Choose operation: +, -, *, /");

        String operation = scanner.next();

        switch (operation) {
            case "+": {
                int sum = add(x, y);
                System.out.println("Sum is: " + sum);
                break;
            }
            case "-": {
                int Subtraction = diff(x, y);
                System.out.println("Subtraction is: " + Subtraction);
                break;
            }
            case "*": {
                int Multiplication = multiply(x, y);
                System.out.println("Multiplication is: " + Multiplication);
                break;
            }
            case "/" : {
                   double div = div(x, y);
                   double mod = rest(x, y);
                   System.out.println("Division is: " + div);
                   System.out.println("Rest of division is: " + mod);
                   break;
               }
            default : {
                System.out.println("Wrong input!");
            }
        }

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int diff(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double div(int a, int b) {
        return a / b;
    }
    public static int rest(int a, int b) {
        return a % b;
    }
}