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