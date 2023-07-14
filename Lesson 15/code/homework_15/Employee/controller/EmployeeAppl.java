package homework_15.Employee.controller;

import homework_15.Employee.model.Employee;

public class EmployeeAppl {
    public static void main(String[] args) {
        double a = 1500.0, b = 3000.0; // задаём переменные для массива salary
        double[] salary = new double[5]; // массив salary

        for (int i = 0; i < 5; i++) {  // задаём условие
            salary[i] = (Math.random() * (b - a + 1) + a); //задаём случайным образом размер зарплаты
        }
        // создаём объектные переменные

        Employee employee1 = new Employee("Afanasii", "Kuznetzov", 1000000001L, "Man", salary[0], 6 );
        Employee employee2 = new Employee("Pelageea", "Sokolowa", 1000000002L, "Female", salary[1], 5 );
        Employee employee3 = new Employee("Juan", "Alvares", 1000000003L, "Male", salary[2], 1 );
        Employee employee4 = new Employee("Angelina", "Morozowa", 1000000004L, "Female", salary[3], 4 );
        Employee employee5 = new Employee("Michelle", "Brunner", 1000000005L, "Diverse", salary[4], 1 );
      //  Employee employee6 = new Employee();

       // employee6.setFirstName("Oleg");
       // employee6.setLastName("Goretz");


       // employee1.setFirstName("Afanasii");
      //  employee1.firstName = "Afanasii";

      //  String employeeName = employee1.getFirstName();

        System.out.println("=========================");
        employee1.display();                            // // выводим на печать employee 1 - 5
        System.out.println("=========================");
        employee2.display();
        System.out.println("=========================");
        employee3.display();
        System.out.println("=========================");
        employee4.display();
        System.out.println("=========================");
        employee5.display();


    }

}
