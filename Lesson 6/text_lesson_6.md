Основные методы класса String
Основные операции со строками раскрываются через методы класса 
String. valueOf(): преобразует объект в строковый вид 
charAt(): возвращает символ строки по индексу, Beispiel charAt("Java", 2) => v
equals(): сравнивает строки с учетом регистра, 
equalsIgnoreCase(): сравнивает строки без учета регистра, Beispiel Leonid = leonid эти строки будут равны
indexOf(): находит индекс первого вхождения подстроки в строку, Beispiel indexOf(J, "Java") => 0
startsWith(): определяет, начинается ли строка с подстроки, cm. practice, результат будет true или false (тип boolean - логический тип)
endsWith(): определяет, заканчивается ли строка на определенную подстроку 
replace(): заменяет в строке одну подстроку на другуюб Beispiel: может помемять все буквы "а" на буквы "б"
trim(): удаляет начальные и конечные пробелы 
substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса, cm. practice
toLowerCase(): переводит все символы строки в нижний регистр 
toUpperCase(): переводит все символы строки в верхний регистр
****

public class Main {
public static void main(String[] args) {
System.out.println("String practice");
String st = "I like Java! Java is the best way to earn good salary in IT.";
System.out.println(st);
// Распечатать последний символ строки. Используем метод String. charAT().
int l = st.length(); // определяем длину строки
System.out.println("Length of String is: " + l); // выводим длину строки на печать
}

****

public class Main {
public static void main(String[] args) {
System.out.println("String practice");

        String st = "I like Java! Java is the best way to earn good salary in IT.";
        System.out.println(st);
        // Распечатать последний символ строки. Используем метод String. charAT().

        int l = st.length(); // определяем длину строки
        System.out.println("Length of String is: " + l); // выводим длину строки на печать

        char lastSymbol = st.charAt(59); // так мы узнали последний символ
        // char lastSymbol = st.charAt(st.length() -1); // так мы узнали последний символ
        System.out.println("Last Symbol is: " + lastSymbol);

        // Найти позицию подстройки "Java в строке "I like Java!"".
        String st1 = "I like Java!"; // Задали строку
        int index = st1.indexOf("Java"); // узнаём с какова индекса начинается слова Java
        System.out.println("Java starts from index " + index); // печатаем результат

        int index1 = st1.indexOf("like");
        System.out.println("like starts from index " + index1);

        // Проверить, содержит ли заданная строка подстроку "Java". Используем метод String.contains().
        boolean yesOrNo = st.contains("Java");
        System.out.println(yesOrNo); // Печатаем результат

        // Заменить все символы "а" на "о".
        String stNew = st.replace("a", "o"); //  делаем замену в строке st всех букв "а" на букву "о".
        System.out.println(stNew); // заменяем и печатаем

        // Преобразуйте строку к верхнему и нижнему регистру.
        String stNew1 = st.toLowerCase();// переводим строку к нижний регистр.
        System.out.println(stNew1); // печатаем результат

        String stNew2 = st.toUpperCase(); // переводим строку к верхний регистр.
        System.out.println(stNew2);// печатаем результат

        // Вырезаем строку Java  с помощью String.substring().
        String stNew3 = st.substring(7, 10); // вырезаем
        System.out.println(stNew3); // печатаем

        // проверить, заканчивается ли ваша строка подстрокой "!!!". Используем метод String.endsWith().
        // привыкаем к типу boolean

        String stnew4 = "I like Java!!!";
        yesOrNo = stnew4.endsWith("!!!"); // выясняем
        System.out.println(yesOrNo);

    }
}

****

public class Main {
public static void main(String[] args) {
System.out.println("Perimeter of Rectangle with method");

        int a = 100; // 1-я сторона прямоугольника
        int b = 300; // 2-я сторона прямоугольника

        int per = perimeter(a, b);
        System.out.println("Perimeter = " + per);

    } // конец метода main
    // ________Methods________

    public static int perimeter(int x, int y) { // метод получает на вход два целых числа
      //  int p = (x + y)*2;
      //  return p;
        return (x + y)*2; // возвращает результат
    }

    // ________end of Methods________
} // конец класса Main

****

public class Main {
public static void main(String[] args) {
System.out.println("Type char - practic");

        char ch = 65;
        System.out.println("Symbol with number 65: " + ch); // это z

        char ch1 = 90;
        System.out.println("Symbol with number 90: " + ch1); // это а

        char ch2 = 176;
        System.out.println("Temperature 23" + ch2); // это градусы

        char ch3 = 178;
        System.out.println("2x" + ch3); //

    }
}

****
