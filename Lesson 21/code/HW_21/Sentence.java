package HW_21;

public class Sentence {
    public static void main(String[] args) {
//        Дано предложение: "Казнить нельзя помиловать".
//        - Поменяйте первое и последнее слово в нем местами;
//        - добавьте в него запятую на нужном месте и выведите на печать.

        String str = "Казнить нельзя помиловать";
        System.out.println(str);

        String[] words = str.split(" "); // разделяем строку на слова, потому что разделителем является " " (пробел)

        // переставляем слова в массиве
        String t = words[0];
        words[0] = words[2];
        words[2] = t;
        System.out.println();

        // и добавляем "," к нужному слову
        System.out.println(words[0] + "," + words[1] + " " + words[2]);
    }
}
