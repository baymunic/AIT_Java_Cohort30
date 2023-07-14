package HW_23.task_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    // поле класса
    IsPrime n; // определяем поле с типом тестируемого класса и создаём объект "sentence" такого типа

    @BeforeEach
    void setUp() { n = new IsPrime();
    }

    @Test
    void isPrimeCheckTest() {
        int num = 7;
        assertTrue(IsPrime.isPrimeCheck(num));
    }
}