package practice_39.time_appl;

// нет полей
// нет конструкторов
// нет сеттеров и геттеров
// есть метод main

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeAppl {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();// вернули дату
        System.out.println(currentDate);
        System.out.println("=================");

        LocalTime currentTime = LocalTime.now();// вернули время
        System.out.println(currentTime);
        System.out.println("=================");

        LocalDateTime localDateTime = LocalDateTime.now();// вернули дату и время в международном формате
        System.out.println(localDateTime);
        System.out.println("=================");

        LocalDate gagarin = LocalDate.of(1961, 4, 12);
        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getDayOfYear());
        System.out.println(gagarin.getMonth());
        System.out.println("=================");

        System.out.println("Gagarin Day of month " + gagarin.getDayOfMonth());
        System.out.println("Gagarin Day of week " + gagarin.getDayOfWeek());
        System.out.println("=================");

        System.out.println(gagarin.isBefore(currentDate)); // ожидаем true
        System.out.println(gagarin.isAfter(currentDate)); // ожидаем false
        System.out.println("=================");

        System.out.println("=====Traveling In Time=====");
        // add days to current day

        LocalDate newDate = currentDate.plusDays(40000);
        System.out.println("Add 40.000 days: " + newDate);
        System.out.println(".................");

        newDate = currentDate.plusWeeks(12);
        System.out.println("Add 12 Weeks: " + newDate);
        System.out.println(".................");

        // 2 month ago
        newDate = currentDate.minusMonths(2);
        System.out.println("2 month ago: " + newDate);
        System.out.println(".................");
        System.out.println("=================");


        // operations with ChronoUnits
        System.out.println(localDateTime.plus(9, ChronoUnit.DAYS));
        System.out.println(".................");
        // Centuries = 100 лет
        System.out.println(currentDate.plus(10, ChronoUnit.CENTURIES));
        System.out.println("=================");

        // получение интервала времени
        LocalDate lenin = LocalDate.of(1870, 4, 22);
        long res = ChronoUnit.YEARS.between(lenin, gagarin);
        System.out.println("День рождение Ленина минус день старта Гагарина (в годах): " + res);
        System.out.println("=================");

        System.out.println("Compare LocalDate");
        System.out.println(gagarin.compareTo(lenin)); // сравнение дат
        System.out.println("=================");

        //LocalDate array sorting
        LocalDate[] dates = {gagarin, currentDate, lenin};
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        System.out.println("=====Date Formatter=====");
        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarin.format(df));
        System.out.println("=================");
        df = DateTimeFormatter.ofPattern("dd | MM | yyyy");
        System.out.println(gagarin.format(df));

        String date1 = "06/07/2023";
//        String date2 = "2023-02-02";

        System.out.println("localDate1");
        LocalDate localDate1 = dateParse(date1);
        System.out.println(localDate1);

        System.out.println("localDate2");
//        LocalDate localDate2 = dateParse(date2);
//        System.out.println(localDate2);

    }
    private static LocalDate dateParse(String date) {
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd.MM.yyyy]");

        return LocalDate.parse(date, df);
//        if (date.contains("-")) {
//            return LocalDate.parse(date);
//        } else {
//            return LocalDate.parse(date, df);
//        }


    }
}
