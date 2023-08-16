package practice_38.coffee;

import java.util.Scanner;

public class CoffeeMashine {
    public static void main(String[] args) {

        System.out.println("Welcome to our Coffee Shop!");

        // предложить меню
        Coffee[] menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i]);
        }
        System.out.println("====================");
        // понять пользователя
        System.out.println("Input number of your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // объявить цену и предложить оплатить
        switch (choice){
            case 1: {
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice - 1]. getVolume() + " ml");
                System.out.println("Price is: " + menu[choice - 1].getPrice() + " Euro");
                break;
            }
            case 2: {
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice - 1]. getVolume() + " ml");
                System.out.println("Price is: " + menu[choice - 1].getPrice() + " Euro");
                break;
            }
            case 3: {
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice - 1]. getVolume() + " ml");
                System.out.println("Price is: " + menu[choice - 1].getPrice() + " Euro");
                break;
            }
            case 4: {
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice - 1]. getVolume() + " ml");
                System.out.println("Price is: " + menu[choice - 1].getPrice() + " Euro");
                break;
            }
            case 5: {
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice - 1]. getVolume() + " ml");
                System.out.println("Price is: " + menu[choice - 1].getPrice() + " Euro");
                break;
            }
            default: {
                System.out.println("Wrong choice!");
            }
        }

    }
}
