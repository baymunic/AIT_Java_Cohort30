import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your String: ");
        String st = in.nextLine();

        int l = st.length(); // определяем длину строки
        System.out.println("Length of String is: " + l);

        int leftIndex = 0;
        int rightIndex = l - 1;

        char a = st.charAt(leftIndex);
        char b = st.charAt(rightIndex);
        System.out.println(a);
        System.out.println(b);

        System.out.println(st.substring(leftIndex, rightIndex));

    }
}