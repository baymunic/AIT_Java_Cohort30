package practice_37.employee_company.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_37.employee_company.model.Employee;
import practice_37.employee_company.model.Engineer;
import practice_37.employee_company.model.Worker;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

//**Задание 5.**
//        CompanyImpl реализовать методы для поиска сотрудников по критериям:
//        - имеющих стаж более 5 лет
//        - имеющих зарплату менее 2000 евро
//        - не имеющих высшее образование
//
//        **Задание 6.**
//        Создать компараторы и получить отсортированные списки сотрудников:
//        - по возрасту
//        - по стажу работы в компании
//        - по величине зарплаты
//        - по образованию (выше образованные в начале списка)


class CompanyImplTest {

    CompanyImpl company; // подключение тестируемого класса, создание объектной переменной
    Employee[] employees; // поле типа Employee, это массив, пока он получил только название

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(10); // переменная Company - это вызов конструктора
        employees = new Employee[5];
        employees[0] = new Engineer(101, "John", 35, 7, "1 - phd",1000.0, 5, 160);
        employees[1] = new Engineer(102, "Ann", 30, 5, "2 - university", 900.0, 4, 160);
        employees[2] = new Worker(103, "Peter", 45, 15, "3 - high school", 850.0, 160);
        employees[3] = new Worker(104, "Robin", 28, 10, "4 - real school", 750.0, 160);
        employees[4] = new Worker(105, "Mike", 20, 2, "4 - real school", 600.0, 160);

        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }
    }


    @Test
    void addEmployee() {
        System.out.println(company.size());
        Engineer engineer = new Engineer(106, "Stefan", 40, 1, " 3 - high school", 900.0, 4, 160);

        assertTrue(company.addEmployee(engineer)); // тест на добавление
        assertEquals(6, company.size()); // проверка size

        assertFalse(company.addEmployee(null)); // тест на добавление null
        assertFalse(company.addEmployee(engineer)); // тест на добавление дубликата

        System.out.println(company.size());

    }

    @Test
    void removeEmployee() {
        System.out.println(company.size()); // печать size
        company.printEmployees();
//        company.removeEmployee(105);
        assertEquals(employees[4], company.removeEmployee(105)); // тест на удаление, выбрали произвольного сотрудника
        System.out.println(company.size()); // проверили, что размер компании уменьшился
        company.printEmployees();

    }

    @Test
    void findEmployee() {



    }

    @Test
    void size() {



    }

    @Test
    void printEmployees() {



    }

    @Test
    void testSortByExperience(){

        Comparator<Employee> employeesComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getExperience() - o2.getExperience(); // сравнение по полю experience, которое имеет тип int
            }
        };
            Employee[] sortedArray = Arrays.copyOf(employees, company.size());
            Arrays.sort(sortedArray, employeesComparator);

        Arrays.sort(employees, employeesComparator);
        company.printEmployees();
    }

}
/*
public Employee[] getEmployeesSortedByExperience() {
        Employee[] sortedArray = Arrays.copyOf(employees, employeeCount);
        Arrays.sort(sortedArray, new EmployeeComparators.ExperienceComparator());
        return sortedArray;
    }
public static class ExperienceComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return Integer.compare(employee1.getExperience(), employee2.getExperience());
        }
    }
public static Comparator<Employee> ExperienceComparator = Comparator.comparingInt(Employee::getExperience);
 */




//        **Задание 6.**
//        Создать компараторы и получить отсортированные списки сотрудников:
//        - по возрасту
//        - по стажу работы в компании
//        - по величине зарплаты
//        - по образованию (выше образованные в начале списка)