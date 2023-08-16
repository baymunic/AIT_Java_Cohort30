package hw_35.dao;

import hw_35.model.Employee_new;

public class CompanyImpl_new implements Company_new{

    // поля
    private Employee_new[] employees;
    private int size; // размер компании

    // конструктор
    public CompanyImpl_new(int capacity) { employees = new Employee_new[capacity];} // capacity - длина массива

    @Override
    public boolean addEmployee(Employee_new employee) {
        if (employee == null || size == employees.length || findEmployee(employee.getName()) != null) {
            return false;
        }
        employees[size] = employee; // добавление в конец массива
        size++;
        return true;
    }

    @Override
    public Employee_new removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName() == name){
                Employee_new victim = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee_new findEmployee(String name) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getName() == name) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public String findEmployeeEducation(String education) {
        for (int i = 0; i < size; i++) {
            if (education == "high") { // нужен equals
            }
        }
        return education;
    }

    @Override
    public int findEmployeeExperience(int experience) {
        for (int i = 0; i < size; i++) {
            if (experience >= 5) {
            }
        }
        return experience;
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployees() {
    }
}
