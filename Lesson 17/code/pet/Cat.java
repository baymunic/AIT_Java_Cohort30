package pet;

public class Cat extends Pet{

    public Cat(String name, String petType, int weight, String livingCondition) {
        super(name, petType, weight, livingCondition);
    }

    public Cat() {
    }
    public void voice (){
        System.out.println("Мяу!");
    }
}
