package practice_38.seasons;

public class SeasonAppl {
    public static void main(String[] args) {

        Season season = Season.SUMMER;

        System.out.println(season);
        System.out.println(Season.AUTUMN);
        System.out.println(season.name());

        System.out.println("===== Values =====");
        Season[] seasons = Season.values();
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        System.out.println("===== ordinal =====");
        System.out.println(season.name());
        System.out.println(season.ordinal()); // порядковый номер в списке ENUM
        System.out.println(season.SPRING.ordinal()); // ожидаем 1
        System.out.println(season.AUTUMN.ordinal()); // ожидаем 3
    }
}
