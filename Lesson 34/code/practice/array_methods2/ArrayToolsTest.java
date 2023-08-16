package practice.array_methods2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.Soldier2.model.Soldier;

import java.util.Arrays;
import java.util.Comparator;

class ArrayToolsTest {

    Integer[] arrNum;
    String[] arrStr;
    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[] {9, 7, 4 , 7, 2, 5, 9, 1, 0};
        arrStr = new String[] {"one", "two", "three", "four", "five"};
        soldiers = new Soldier[] {
          new Soldier("John", 182, 82.3, 81),
          new Soldier("Peter", 175, 77.1, 75),
          new Soldier("Robin", 182, 69.3, 92),
          new Soldier("Mary", 159, 55.1, 91),
          new Soldier("Anna", 162, 55.0, 88)

        };
    }

    @Test
    public void printArray () {
        System.out.println("=======Test PrintArray=======");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
        ArrayTools.printArray(soldiers);

    }

    @Test
    void testSearch() {
        System.out.println("=======testSearch=======");
        // для целых чисел
//        ArrayTools.printArray(arrNum);
        Integer res = ArrayTools.search(arrNum, 5);
        System.out.println(res);
        assertEquals(5, res);
        assertEquals(-1, ArrayTools.search(arrNum, 100));

        // для строки
//        ArrayTools.printArray(arrStr);
        int index = ArrayTools.search(arrStr, "four");
        assertEquals(3, index);
        assertEquals(-1, ArrayTools.search(arrNum, "six"));

        // для soldiers
//        ArrayTools.printArray(soldiers);
        index = ArrayTools.search(soldiers, new Soldier("John", 182, 82.3, 91));
//        index = ArrayTools.search(soldiers, soldiers[0]);

        assertEquals(0, index);
    }

    @Test
    void searchBoolean() {
    }

    @Test
    void testFindByPredicate() {
        System.out.println("=======testSearchPredicate=======");
        // для целых чисел
//        ArrayTools.printArray(arrNum);
        Integer res = ArrayTools.findByPredicate(arrNum, n -> n > 5 && n < 10);
        System.out.println("res1= " + res);
        res = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println("res2= " + res);

        // для строки
//      ArrayTools.printArray(arrStr);
        String str = ArrayTools.findByPredicate(arrStr, s -> s == "two");
        System.out.println("str1= " + str);
        assertEquals("two", str);
        str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 5);
        System.out.println("str2= " + str);

        // для soldiers
//      ArrayTools.printArray(soldiers);
        Soldier soldier = ArrayTools.findByPredicate(soldiers, soldier1 -> soldier1.getHeight() < 180);
        System.out.println("soldier= " + soldier);
        assertEquals(soldiers[1], soldier);

    }

    @Test
    void testBubbleSort() {
        System.out.println("=======testBubbleSort=======");
//        ArrayTools.printArray(arrNum); // не отсортированный
//        ArrayTools.bubbleSort(arrNum); // отсортировали
//        ArrayTools.printArray(arrNum); // напечатали
        ArrayTools.bubbleSort(arrNum);
        Integer[] expected = new Integer[] {0, 1, 2, 4, 5, 7, 7, 9, 9};
        assertArrayEquals(expected, arrNum);

        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
        String[] expectedStr = new String[] {"five", "four", "one", "three", "two"};
        assertArrayEquals(expectedStr, arrStr);

        ArrayTools.printArray(soldiers);
        ArrayTools.bubbleSort(soldiers);
        ArrayTools.printArray(soldiers);

    }

    @Test
    void testBubbleSortByComparator () {
        System.out.println("=======testSoldiersByName=======");
        ArrayTools.printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        Comparator<Soldier> comparator = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        ArrayTools.bubbleSort(soldiers, comparator);
        ArrayTools.printArray(soldiers);

//        Comparator<Soldier> comparator = Comparator.comparing(Soldier::getName);
    }

    //--------------------------------------------------------------

    @Test
    void testBubbleSortByComparatorInteger() {
        System.out.println("===============testArrNum===============");
        ArrayTools.printArray(arrNum);
        Comparator<Integer> comparatorInt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        };
        ArrayTools.bubbleSort(arrNum, comparatorInt);
        ArrayTools.printArray(arrNum);
    }

    @Test
    void testBubbleSortByComparatorString() {
        System.out.println("===============testArrNum===============");
        ArrayTools.printArray(arrStr);
        Comparator<String> comparatorStr = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        ArrayTools.bubbleSort(arrStr, comparatorStr);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testBubbleSortByComparatorSoldiers() {
        System.out.println("===============testArrNum===============");
        ArrayTools.printArray(soldiers);
        Comparator<Soldier> comparatorSoldiers = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = (int) o1.getWeight() - (int) o2.getWeight();
                if (res != 0) {
                    return res;
                } else {
                    return o1.getHeight() - o2.getHeight();
                }
            }
        };
        ArrayTools.bubbleSort(soldiers, comparatorSoldiers);
        ArrayTools.printArray(soldiers);
    }
}