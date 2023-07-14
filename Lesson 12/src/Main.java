public class Main {
    public static void main(String[] args) {

double credit = 1000;
double finalAmount = 3000;
double percent = 0.1;
int years = 0;

do {
    credit = credit + credit * percent;
    years++;

    System.out.println(years + " " + credit);

} while (credit <= finalAmount);
        System.out.println(years);

    }
}