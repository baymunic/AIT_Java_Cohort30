package pet;

public class Pet {
    // поля объекта класса

    String petType;
    int weight;
    String livingCondition;
    String name;


    // конструктор

    public Pet(String name, String petType, int weight, String livingCondition) {
        this.petType = petType;
        this.weight = weight;
        this.livingCondition = livingCondition;
        this.name = name;
    }

    // пустой конструктор, позволяет создавать пустые объекты данного класса
    public Pet() {
    }

    // методы
    public void display (){
        System.out.println("| Name: " + name + "| Type: " + petType + "| Weight: " + weight + "| Living Condition: " + livingCondition);
    }

    public void eat () {
        System.out.println("The pet eating!");
    }
    public void sleep () {
        System.out.println("The pet sleeping!");
    }
}
