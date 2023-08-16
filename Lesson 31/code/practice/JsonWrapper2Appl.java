package practice;

public class JsonWrapper2Appl {
    public static void main(String[] args) {

        JsonWrapper2 <Long> wrapper2 = new JsonWrapper2 <>(10L);
        System.out.println(wrapper2); // тестируем если работает Обёртка

        Long a = wrapper2.getValue();
        System.out.println(a);
    }
}
