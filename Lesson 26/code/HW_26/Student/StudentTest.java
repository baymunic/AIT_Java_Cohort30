package HW_26.Student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    StudentTest studentTest;

    @BeforeEach
    void setUp() { studentTest = new StudentTest();}

    @Test
    void createStudentList() {
        Student student = new Student();
        String[] students = student.createStudentList();

        assertNotNull(students);
        assertEquals(8, students.length);

        // Проверяем, что список студентов содержит заданные фамилии
        assertTrue(Arrays.asList(students).contains("Иванов"));
        assertTrue(Arrays.asList(students).contains("Петров"));
        assertTrue(Arrays.asList(students).contains("Сидоров"));
        assertTrue(Arrays.asList(students).contains("Смирнов"));
        assertTrue(Arrays.asList(students).contains("Кузнецова"));
        assertTrue(Arrays.asList(students).contains("Волков"));
        assertTrue(Arrays.asList(students).contains("Попова"));
        assertTrue(Arrays.asList(students).contains("Морозова"));
    }

    @Test
    void getRandomGroup() {
        String[] students = {"Иванов", "Петров", "Сидоров", "Смирнов", "Кузнецова", "Волков", "Попова", "Морозова"};
        String[] shuffledStudents = Student.getRandomGroup(students);

        assertNotNull(shuffledStudents);
        assertEquals(students.length, shuffledStudents.length);

        // Проверяем, что массивы содержат одни и те же элементы, но в случайном порядке
        assertNotEquals(Arrays.toString(students), Arrays.toString(shuffledStudents));
    }

    @Test
    void getRemainingStudents() {
        String[] students = {"Иванов", "Петров", "Сидоров", "Смирнов", "Кузнецова", "Волков", "Попова", "Морозова"};
        String[] shuffledStudents = Student.getRandomGroup(students);

        int groupSize = shuffledStudents.length / 2;
        String[] group1 = new String[groupSize];
        String[] group2 = new String[shuffledStudents.length - groupSize];

        System.arraycopy(shuffledStudents, 0, group1, 0, groupSize);
        System.arraycopy(shuffledStudents, groupSize, group2, 0, shuffledStudents.length - groupSize);

        String[] remainingStudents = Student.getRemainingStudents(students, group1);

        // Проверяем, что массивы содержат одни и те же элементы
        assertEquals(Arrays.toString(students), Arrays.toString(remainingStudents));
    }
}