public class BreakContinueExample {
    public static void main(String[] args) {
        // напечатать каждый второй элемент массива
        // Задан массив целых чисел

        int [] num = {56, 73 , 15 , -10 , 37 , -14 , 25 , 65 , 33 , 38}; // задали массив

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) { // проверяем индекс элемента массива на печать
                continue;
            }
            System.out.print(num[i] + " , ");
        }
        System.out.println();

        int n = 553; // дано число
        // найти первый делитель введённого числа
        for (int i = 2; i < n-1 ; i++) {
            if (553 % i == 0){ // % - это деление с остатком, результат = остатку от деления
                System.out.println(n + " делится нацело на " + i);
                break;
            }
        }
    }
}
