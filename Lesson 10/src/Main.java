import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Day & Month information: ");
 /*Задача 10.4(*)
Написать программу, которая принимает с клавиатуры номер месяца и год
и выводит на экран название месяца и количество дней в нем. (повторение условного оператора)*/

        Scanner sc = new Scanner(System.in);  // вводим 3 натуральных числа

        System.out.println("Input the number of month: ");
        int month = sc.nextInt();

        System.out.println("Input the year: ");
        int year = sc.nextInt();

        String monthN;
        int days;

        switch (month) {
            case 1: {
                monthN = "January";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 2: {
                monthN = "February";
                if (leapYear(year)) {
                    days = 29;
                }else {
                    days = 28;
                }
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 3: {
                monthN = "March";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 4: {
                monthN = "April";
                days = 30;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 5: {
                monthN = "May";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 6: {
                monthN = "June";
                days = 30;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 7: {
                monthN = "July";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 8: {
                monthN = "August";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 9: {
                monthN = "September";
                days = 30;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 10: {
                monthN = "October";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;
            }
            case 11: {
                monthN = "November";
                days = 30;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;

            }
            case 12: {
                monthN = "December";
                days = 31;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                break;

            }
            default : {
                monthN = "Wrong month name";
                days = 0;
                System.out.println("Name of month: " + monthN);
                System.out.println("Number of days: " + days);
                System.out.println("Wrong input!");

            }

        }
    }
    public static boolean leapYear(int year) {
        return (year % 4 == 0 & year % 100 != 0) || (year % 400 == 0);
    }
}
