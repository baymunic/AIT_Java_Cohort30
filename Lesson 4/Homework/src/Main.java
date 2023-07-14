import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость товара А: ");
        double d1 = sc.nextDouble();
        System.out.println("Введите количество товара А: ");
        double d2 = sc.nextDouble();
        System.out.println("Введите скидку товара А в %: ");
        double d3 = sc.nextDouble();
        System.out.println("Введите стоимость товара В: ");
        double f1 = sc.nextDouble();
        System.out.println("Введите количество товара В: ");
        double f2 = sc.nextDouble();
        System.out.println("Введите скидку товара В в %: ");

        double f3 = sc.nextDouble();
        double d4 = d3 / 100;
        double d5 = d2 * (d1 * d4); // Rabatt
        double f4 = f3 / 100;
        double f5 = f2 * (f1 * f4); // Rabatt
        double g1 = d5 + f5;
        double g2 = (d1 * d2) + (f1 * f2) - g1;

        System.out.println("Итоговая стоимость покупки " + g2);
        System.out.println("Получинная скидка " + g1);
    }
}