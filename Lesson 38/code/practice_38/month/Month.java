package practice_38.month;

public enum Month {

    // имена констант в JAVA всегда задаются заглавными буквами
    JAN(31),FEB(28), MAR(31), APR(30),
    MAI(31), JUN(30), JUL(31), AUG(31),
    SEP(30), OCT(31), NOV(30), DEC(31);


    // поле класса
    private int days;

    // конструктор
    Month(int days) { // название класса ENUM и конструктора совпадают
        this.days = days;
    }

    public int getDays() { // позволяет вернуть (узнать) кол-во дней в месяце
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }


    // метод увеличивает кол-во месяцев
    public Month plusMonth(int quantity){
        int index = ordinal(); // взяли текущий номер месяца
        index = index + quantity; // увеличили
        Month[] values = values(); // определили массив values
        return values[index % values.length]; // index разделили на 12 = values.length
    }

    // метод возвращает имя месяца по его номеру
    public static String getName(int num) { // static - позволяет вызывать метод по имени класса
        Month[] values = values(); // определили массив values
        return values[(num - 1) % values.length].name(); // возвращаем имя правильного месяца

    }


}
