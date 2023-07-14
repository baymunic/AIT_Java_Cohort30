import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Calculator");
/*Написать приложение-калькулятор для 4-х математических действий: +, -, *, /
  Использовать switch ... case на основе int, char.*/
   // Задача на использование строковых переменных в условиях

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Choose operation: 1 - +, 2 - -, 3 - *, 4 - /");
        int operation = scanner.nextInt(); // read operation

        switch (operation) {
            case 1: {
                System.out.println("Sum is: " + (a +b));
                break;
            }
            case 2: {
                System.out.println("Subtraction is: " + (a - b));
                break;
            }
            case 3: {
                System.out.println("Multiplication is: " + (a * b));
                break;
            }
            case 4: {
                double div = (double) (a / b);
                System.out.println("Division is: " + div);
                break;
            }
            default: {
                System.out.println("Wrong input!");
            }
        } // end of switch
    }
}