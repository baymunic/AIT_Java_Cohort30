package HW_23.task_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setUp() { user = new User("babushka@mail.ru", "Ud!54321");
    }

    @Test
    void validateEmailTest() {
        assertEquals(true, user.validateEmail("babushka@mail.ru"));
    }

    @Test
    void validatePasswordTest() {
        assertEquals(true, user.validatePassword("Ud!54321"));
    }
}