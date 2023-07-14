package HW_23.task_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Array100Test {

    Array100 array100;

    @BeforeEach
    void setUp() { array100 = new Array100();
    }

    @Test
    void generateRandomArrayTest() {
        assertEquals(100, array100.generateRandomArray().length);
    }

    @Test
    void countPositiveNumbersTest() {
        int[] num = {-10, 2, 5, 6, 0, 4};
        assertEquals(4, array100.countPositiveNumbers(num));

    }

    @Test
    void countNegativeNumbersTest() {
        int[] num = {-10, 2, -5, 6, 0, 4};
        assertEquals(2, array100.countNegativeNumbers(num));

    }

    @Test
    void countEvenNumbersTest() {
        int[] num = {-10, 2, 5, 6, 0, 4};
        assertEquals(5, array100.countEvenNumbers(num));

    }

    @Test
    void countZeroesTest() {
        int[] num = {-10, 0, 5, 6, 0, 4};
        assertEquals(2, array100.countZeroes(num));
    }
}