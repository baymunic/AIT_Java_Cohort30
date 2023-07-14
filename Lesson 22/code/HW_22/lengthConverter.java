package HW_22;
import java.util.Scanner;

public class lengthConverter {
    public static void main(String[] args) {
        // Задача 3. (switch case, бесконечный цикл, методы) Составьте программу для перевода мер длины:
        // саженей в метры (1 сажень равна 2,1366 м)
        // дюймов в сантиметры (1 дюйм равен 2,5 см)
        // футов в метры (1 фут равен 0,3048 м)
        // аршинов в метры (1 аршин равен 0,7112 м)
        // дюймов в миллиметры (1 дюйм равен 25,3995 мм)

                Scanner scanner = new Scanner(System.in); // активируем сканер


                while (true) { // используем бесконечный цикл
                    System.out.println("Choose operation: 1 - fathom, 2 - inch, 3 - foot, 4 - arshin");
                    int operation = scanner.nextInt(); // вводим меру длины
                    converter(operation); // используем метод converter

                    System.out.println("Continue? y/n "); // выходим из бесконечного цикла
                    String choice = scanner.next();
                    if (!choice.equals("y")){
                        System.out.println("Thanks, bye!");
                        break;
                    }
                }
    }
    // метод для перевода мер длины
    public static void converter(int operation) {
        Scanner scanner = new Scanner(System.in); // активируем сканер
        System.out.println("Input length: ");
        double x = scanner.nextDouble(); // вводим длину

        switch (operation) {  // используем switch case
            case 1:
                System.out.println("Fathoms to meters: " + (x + 2.1366) + " m");
                          break;
            case 2:
                System.out.println("Inches to centimeters: " + (x + 2.5) + " cm");
                System.out.println("Inches to millimeters: " + (x + 25.3995) + " mm");
                          break;
            case 3:
                System.out.println("Feet to meters: " + (x + 0.3048) + " m");
                          break;
            case 4:
                System.out.println("Arshins to meters: " + (x + 0.7112) + " m");
                          break;
            default:
                System.out.println("Wrong input!");
                    break;
            }
        } // end of switch
}
