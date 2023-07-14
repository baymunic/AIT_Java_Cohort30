public class Rocket {
    public static void main(String[] args) {
        /*Задача 2. Запустить обратный отсчет старта ракеты от 10 до 0.
        Последнее сообщение: "Поехали!..."*/

        int count_down = 0; // параметр (счётчик) цикла

        while (count_down != 0) {
            System.out.println("To start the rocket left: " + count_down + " sec.");
            count_down--; // изменяем параметр цикла
        } //  end of while
        System.out.println("Поехали!...");
    } // end method main
} // end of class
