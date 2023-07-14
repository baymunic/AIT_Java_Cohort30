package practice.computer;

public class Computer {
    // поля объекта класса
    private String cpu;
    private int ram;
    private int ssd;
    private String brand;
    private String indicator;

    // конструктор


    public Computer(String cpu, int ram, int ssd, String brand, String indicator) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.indicator = indicator;
    }

    public Computer() {

    }

    @Override
    public String toString() {
        return "Computer: " + "cpu= " + cpu + ", ram= " + ram + ", ssd= " + ssd + ", brand= " + brand + ", indicator= " + indicator;
    }

    public void display(){
        System.out.println();
        System.out.print("| Brand: " + brand + "| CPU: " + cpu + "| RAM: " + ram + "| SSD: " + ssd);
    }

    // геттеры и сеттеры
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0){
        this.ram = ram;
        }else {
            return;
        }
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        if (ssd > 0) {
            this.ssd = ssd;
        } else {
            return;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void computerTurnOn (){
        indicator = "On";
        System.out.println("Computer is working...");
    }
    public void computerTurnOff (){
        indicator = "Off";
        System.out.println("Computer is NOT working...");
    }
}
