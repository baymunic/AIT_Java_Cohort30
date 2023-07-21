package practice.tests;

import practice.dao.Company;
import practice.dao.CompanyImpl;
import practice.model.Employee;
import practice.model.Manager;
import practice.model.SalesManager;
import practice.model.Worker;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyImplTest {

    Company company;
    Employee[] firm;


    @org.junit.jupiter.api.BeforeEach // void - ничего не возвращает
    void setUp() {
        company = new CompanyImpl();
        firm = new Employee[4];
        firm[0] = new Manager(100, "John", "Smith", 174, 5000, 5);
        firm[1] = new SalesManager(101, "Brad", "Pitt", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firm[3] = new Worker(103, "Robert", "Douny Jr.", 80, 20);

        for (int i = 0; i < firm.length; i++) {
            company.addEmployee(firm[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void addEmployee() {
    }

    @org.junit.jupiter.api.Test
    void removeEmployee() {
    }

    @org.junit.jupiter.api.Test
    void findEmployee() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }

    @org.junit.jupiter.api.Test
    void printEmployees() {
    }
}