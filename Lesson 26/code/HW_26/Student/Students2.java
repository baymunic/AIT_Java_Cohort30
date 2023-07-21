package HW_26.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Students2 {
        public static void main(String[] args) {
            // Список студентов
            List<String> students = new ArrayList<>();
            students.add("Иванов");
            students.add("Петров");
            students.add("Сидоров");
            students.add("Смирнов");
            students.add("Кузнецова");
            students.add("Волков");
            students.add("Попова");
            students.add("Морозова");

            // Перемешиваем список студентов случайным образом
            Collections.shuffle(students);

            // Определяем размер каждой группы
            int groupSize = students.size() / 2;

            // Разделяем список студентов на две группы
            List<String> group1 = students.subList(0, groupSize);
            List<String> group2 = students.subList(groupSize, students.size());

            // Печатаем результаты
            System.out.println("Группа 1: " + group1);
            System.out.println("Группа 2: " + group2);
        }
    }


