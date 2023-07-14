**Задача 1**
Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!" 
Повторить практикум с этой строкой.

Распечатать последний символ строки.
Найти позицию подстроки “Java” в строке.
Проверить, содержит ли заданная строка подстроку “Java”.
Заменить все символы “o” на “a”.
Преобразуйте строку к верхнему регистру.
Преобразуйте строку к нижнему регистру.
Вырезать строку Java c помощью метода substring().
Проверить, заканчивается ли ваша строка подстрокой “!!!”.
Проверить, начинается ли ваша строка подстрокой “I'm proud”.

public class Main {
public static void main(String[] args) {
System.out.println("String homework");

        String stHW = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(stHW);

        int index = stHW.indexOf("Java");
        System.out.println("Java starts from index " + index);

        boolean yesOrNo = stHW.contains("Java");
        System.out.println(yesOrNo);

        String stNew = stHW.replace("o", "a");
        System.out.println(stNew);

        String stUp = stHW.toUpperCase(); 
        System.out.println(stUp);

        String stLow = stHW.toLowerCase();
        System.out.println(stLow);

        String stSub = stHW.substring(19, 23);
        System.out.println(stSub);

        yesOrNo = stHW.endsWith("!!!");
        System.out.println(yesOrNo);

        yesOrNo = stHW.startsWith("!!!");
        System.out.println(yesOrNo);
    }
}

**Задача 2**
Запросить у пользователя длину радиуса окружности. 
Написать метод, который находит площадь круга для введенного радиуса. 
Вычислить площадь круга, вызвав написанный метод.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the length of the radius of the circle: ");

        double s = getArea(); // вызов метода
        System.out.println("Area = " + s);

    } public static double getArea() { // метод запрашивает у пользователя длину радиуса окружности
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble(); // вводим радиус
        return Math.PI*r*r; // возвращаем результат
    }
}

**Задача 3**
Даны строки разной длины (длина - четное число), 
необходимо вернуть два средних знака этой строки. 
Например, если дана строка "string" результат будет "ri", 
для строки "code" результат "od",
для "Practice" результат "ct".

public class Main {
public static void main(String[] args) {

        String a = "String";
        String b = "Code";
        String c = "Practice";

        int mi1 = a.length(); // опрделяем длину строки
        int mi2 = b.length();
        int mi3 = c.length();

        System.out.println("Length of String is: " + mi1); // выводим длину строки на печать
        System.out.println("Length of Code is: " + mi2);
        System.out.println("Length of Practice is: " + mi3);

        int middle1 = mi1/2; // выявляем середину
        int middle2 = mi2/2;
        int middle3 = mi3/2;

        String a1 = a.substring(middle1-1, middle1+1); // находим два средних знака этой строки
        String b1 = b.substring(middle2-1, middle2+1);
        String c1 = c.substring(middle3-1, middle3+1);

        System.out.println(a1); // выводим два средних знака этой строки
        System.out.println(b1);
        System.out.println(c1);
    }
}

**Задача 4 (*)**
Напишите программу, которая читает строку от пользователя, 
определяет левый индекс и правый индекс (концы строки) 
и выводит получившуюся в результате substring с левым и правым индексом.

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Input your String: ");
String st = in.nextLine();

        int l = st.length(); // определяем длину строки
        System.out.println("Length of String is: " + l);

        int leftIndex = 1 - 0;
        int rightIndex = l - 1;

        char a = st.charAt(leftIndex);
        char b = st.charAt(rightIndex);
        System.out.println(a);
        System.out.println(b);

        System.out.println(st.substring(leftIndex, rightIndex));

    }
}