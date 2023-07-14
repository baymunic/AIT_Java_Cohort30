package practice.computer;

public class Laptop extends Computer {
    private int size;
    private int weight;
    private String color;

    public Laptop(String cpu, int ram, int ssd, String brand, String indicator, int size) {
        super(cpu, ram, ssd, brand, indicator);
        this.size = size;
    }

    public Laptop(int size) {
        this.size = size;
    }


// конструктор без поля color


    @Override
    public void display() {
        super.display();
        System.out.println("| Size: " + size + "| Weight: " + weight+ "| Color: " + color);
    }

    // это методы, которые устанавливают и получают значения полей

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
