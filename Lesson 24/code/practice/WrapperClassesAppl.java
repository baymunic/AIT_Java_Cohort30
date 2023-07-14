package practice;

public class WrapperClassesAppl {
    public static void main(String[] args) {

        // как найти кол-во цифр в числе - версия 2 (цикл делим число на 10 пока оно не кончится)
        System.out.println("=========Digits in number=========");
        Integer x = 1000;
        String st = x.toString();
        System.out.println("Number of digits " + x + " are " + st.length());
        Double y = 32456.78;
        String st1 = y.toString();
        System.out.println("Number of digits " + y + " are " + st1.length());

        // присвоение и вычисление
        System.out.println("=========Calculation=========");
        int n = 20;
        Integer z = 10;
        System.out.println(n);
        System.out.println(z);
        z = z + 100;
        System.out.println(z);
        Double pi = 3.14;
        double circleLenght = 2 * pi * 10;
        System.out.println(circleLenght);

        // методы с константами классов
        System.out.println("=========Constants of Wrapper Classes==========");
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN: " + Integer.MIN_VALUE);
        System.out.println("Long MIN: " + Long.MIN_VALUE);
        System.out.println("Double MAX: " + Double.MAX_VALUE);

        // как "обработать" деление на ноль?
        System.out.println("________Not-a-Number (Nan) _________");
        double a = 20.0 / 0.0;
        if (Double.isInfinite(a) || Double.isNaN(a)) {
            System.out.println("Wrong operation or wrong result.");
        } else {
            System.out.println(a);
        }

        // парсинг String to Number (приведение строки к числу)(к нам на вход прилетела строка)
        String str1 = "987654";
        int num = Integer.parseInt(str1); // парсинг строки в число
        System.out.println(num);

        String str2 = "2.7118281828";
        double exp = Double.parseDouble(str2);
        System.out.println(exp);
    }
}
