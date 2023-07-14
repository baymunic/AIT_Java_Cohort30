package pet;

public class Dog extends Pet {

    public Dog(String name, String petType, int weight, String livingCondition) {
        super(name, petType, weight, livingCondition);
    }

    public Dog() {
    }

    // метод run
    public void run (){
        System.out.println("The Dog running!");
    }

    public void voice (){
        System.out.println("Гав-гав!");
    }
}
