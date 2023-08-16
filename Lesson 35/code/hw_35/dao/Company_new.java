package hw_35.dao;


import hw_35.model.Employee_new;

public interface Company_new {

    // нанимаем на работу
    boolean addEmployee (Employee_new employeeNew); // добавить сотрудника в компанию

    // увольнение
    Employee_new removeEmployee (String name);

    // найти сотрудника по имени
    Employee_new findEmployee (String Name);

    String findEmployeeEducation(String education);

    int findEmployeeExperience(int experience);

    // размер компании
    int size();

    // печатаем список компании
    void printEmployees();

}
