package HW_21;

public class Coins {
    public static void main(String[] args) {
// На столе лижат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом.
// Определите минимальное число монеток, которые нужно перевернуть,
// чтобы все монетки были повернуты вверх одной и той же стороной.

        int[] coins = new int[15];
        int eagle = 1;
        int tails = 0;

        // заполняем массив случайными числами 0 или 1
        for (int i = 0; i < coins.length; i++) {
            coins[i] = (int) (Math.random() * (eagle - tails + 1) + tails);
            System.out.print(coins[i] + " ");
        }
        System.out.println();

        int countEagle = 0;
        int countTails = 0;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == 0) {
                countEagle++;
            }else {
                countTails++;
            }
        }
        if (countEagle < countTails) {
            System.out.println("You have to turn coins tails up.");
        }else {
            System.out.println("You have to turn coins eagle up.");
        }
    }
}
