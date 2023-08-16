package practice;

public class JsonWrapper1Appl {
    public static void main(String[] args) {
        // Generics - параметры для классов и методов
        // {имя: Леонид; возраст : 59; ... } - так выгладит Json
        // {value : 60}

        JsonWrapper1 wrapper1 = new JsonWrapper1("10");
        System.out.println(wrapper1);

        Integer a = (int) wrapper1.getValue();
    }
}
