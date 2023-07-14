public class hmFactorial {
    //----------------------------------------
    public static void main(String[] args) {
        System.out.println("Factorial calculation");
        int n = 17;   // до какого числа будем вычислять факториал
        int f = factorial(n);   // вызов метода с параметром n
        System.out.println("n! = " + f);
    }
    //----------------------------------------
    public static int factorial(int n) {
        int res = 1;  // переменная для накопления результата
        int i = 1;    // начальное значение
        while (i <= n){  // пока i растёт до n - 1
            res = res * i;  // вычисление факториала
            i++;            // увеличение параметра цикла
        }
        return res;
    }
}
