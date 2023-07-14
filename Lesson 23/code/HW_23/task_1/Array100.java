package HW_23.task_1;

public class Array100 {

    public int[] generateRandomArray() {
        int[] num = new int[100];  // объявление массива
        int a = -10, b = 10;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами
            num[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(" " + num[i] + " ");
        }
        return num;
    }

    public int countPositiveNumbers(int[] num) {
        int count = 0;

        for (int number : num) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegativeNumbers(int[] num) {
        int count = 0;

        for (int number : num) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    public int countEvenNumbers(int[] num) {
        int count = 0;

        for (int number : num) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countZeroes(int[] num) {
        int count = 0;

        for (int number : num) {
            if (number == 0) {
                count++;
            }
        }
        return count;
    }
}

