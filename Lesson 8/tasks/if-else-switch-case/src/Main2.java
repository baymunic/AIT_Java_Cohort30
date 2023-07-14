import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Calculator");
/*Написать приложение-калькулятор для 4-х математических действий: +, -, *, /
  Использовать switch ... case на основе int, char.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Choose operation: +, -, *, /");
//        int operation = scanner.nextInt(); // read operation

        String operation = scanner.next();

        switch (operation) {
            case "+": {
                System.out.println("Sum is: " + (a + b));
                break;
            }
            case "-": {
                System.out.println("Subtraction is: " + (a - b));
                break;
            }
            case "*": {
                System.out.println("Multiplication is: " + (a * b));
                break;
            }
            case "/" : {
                double div = (double) (a / b);
                System.out.println("Division is: " + div);
                break;
            }
            default : {
                System.out.println("Wrong input!");
            }
        } // end of switch
    }
}