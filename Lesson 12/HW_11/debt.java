public class debt {
    public static void main(String[] args) {

                System.out.println("Businessman's debt");

                double ssuda = 10000000;
                double procent = 10.0;
                double debt = 50000000;

                double sum = 0;
                int year = 1;

                while (sum < debt) {
                    sum = (year == 1) ? ssuda + ssuda*procent : sum + sum * procent;
                    year ++;
                }
                System.out.println("After " + year + " debt will be more than " + debt + ".");
    }
}
