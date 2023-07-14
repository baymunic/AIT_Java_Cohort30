package practice.HW_24;

public class HW_24_1 {
    public static void main(String[] args) {
        test1();
        System.out.println("=============");
        test2();
        System.out.println("=============");
    }
    // методы
    public static void test2 () {
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());
    }
    public static void test1 ()  {
            Integer myInt = 5;
            Double myDouble = 5.99;
            Character myChar = 'A';
            System.out.println(myInt);
            System.out.println(myDouble);
            System.out.println(myChar);
    }
}
