// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        public static void main(String[] args) {
            int summa = 0;
            for(int i=2; i< coordinates.length; i=i+2) {
                summa+=i;
            }
            System.out.println(summa);
        }
    }