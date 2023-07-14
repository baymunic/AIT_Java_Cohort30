package practice;

import practice.model1.Computer;

public class ComputerCompareAppl {
    public static void main(String[] args) {

        Computer comp1 = new Computer("i5", 8, 256, "Lenovo");
        Computer comp2 = new Computer("i5", 8, 256, "Lenovo");
        Computer comp3 = new Computer("i7", 16, 512, "Asus");
        Computer comp4 = new Computer("i9", 32, 2048, "Predator");
        Computer comp5 = new Computer("i3", 6, 128, "Acer");

        System.out.println(comp1 == comp2);

        System.out.println(comp1.equals(comp2));
        System.out.println(comp1.equals(comp3));

        Computer[] arrayOfComps = new Computer[5];
        arrayOfComps[0] = comp1;
        arrayOfComps[1] = comp2;
        arrayOfComps[2] = comp3;
        arrayOfComps[3] = comp4;
        arrayOfComps[4] = comp5;

        printArray(arrayOfComps);  // печатаем массив объектов

        // сложим все ssd
        int sum = 0;
        for (int i = 0; i < arrayOfComps.length; i++) {
            sum = sum + arrayOfComps[i].getSsd();
        }
        System.out.println("Total SSD memory: " + sum);

    }
    // _____методы_____

    // печать массива
    public static void printArray (Object[] arr) {
        for (int i = 0; i < arr.length; i++) { // это array внутри метода
            System.out.println(arr[i].toString());

        }
    }
}
