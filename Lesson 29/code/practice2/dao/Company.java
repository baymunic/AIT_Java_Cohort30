package practice2.dao;

//import practice.company1.model.Employee;
import practice2.model.Employee;

public interface Company {
    // перечень действий = методов

    // берем на работу
 //   boolean addEmployee(Employee employee); // добавить сотрудника в компанию

    // увольнение
    Employee removeEmployee(int id); // удаляем сотрудника из компании

    // найти сотрудника по id
    Employee findEmployee(int id); // ищем сотрудника в компании

    // размер компании
    int size();

    // печатаем список компании
    void printEmployees();

    boolean addEmployee(Employee employee);
}
