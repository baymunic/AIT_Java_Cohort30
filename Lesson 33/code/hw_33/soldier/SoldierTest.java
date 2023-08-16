package hw_33.soldier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class SoldierTest {

    Soldier[] soldier;
    @BeforeEach
    void setUp() {
        soldier = new Soldier[15]; // задаём массив

        soldier[0] = new Soldier("Carter", 182, 95, 31);
        soldier[1] = new Soldier("Smith", 177, 86, 22);
        soldier[2] = new Soldier("Sam", 190, 101, 33);
        soldier[3] = new Soldier("Taylor", 188, 86, 55);
        soldier[4] = new Soldier("Ambros", 176, 82, 35);
        soldier[5] = new Soldier("Luke", 198, 110, 76);
        soldier[6] = new Soldier("Mathias", 175, 84, 87);
        soldier[7] = new Soldier("Paul", 179, 80, 88);
        soldier[8] = new Soldier("Mike", 196, 99, 89);
        soldier[9] = new Soldier("Dorian", 191, 87, 10);
    }

    @Test
    void testSort (){
        System.out.println("====== Array as is ======");
        printArray(soldier);
        System.out.println();
        Arrays.sort(soldier);
        System.out.println("====== Array sorted ======");
        printArray(soldier);
    }

    @Test
    void testSortComparator (){
        System.out.println("====== Array as is ======");
        printArray(soldier);
        System.out.println();

        Comparator<Soldier> soldierComparator = new Comparator<Soldier>() { // определяем способ сортировки
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return -(o1.getProfile() - o2.getProfile()); // по Profile
            }
        };

        Arrays.sort(soldier, soldierComparator); // выбираем другой метод класса - Arrays
        System.out.println("====== Array sorted ======");
        printArray(soldier);
    }

    static void printArray (Object[] arr) {
        for (Object name : arr) {
            System.out.println(name);
        }
    }
}