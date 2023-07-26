package practice2.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice2.dao.Company;
import practice2.dao.CompanyImpl;
import practice2.model.Employee;
import practice2.model.Manager;
import practice2.model.SalesManager;
import practice2.model.WageEmployee;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] firm;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        firm = new Employee[4];
        firm[0] = new Manager(100, "John","Smith",174,5000,5);
        firm[1] = new SalesManager(101, "Bread", "Pitt", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firm[3] = new WageEmployee(103, "Robert", "Robert", 80,20);
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertTrue(company.addEmployee(firm[0]));
        assertTrue(company.addEmployee(firm[1]));
        assertTrue(company.addEmployee(firm[2]));
        assertTrue(company.addEmployee(firm[3]));
        assertEquals(4, company.size());
        Employee employee = new SalesManager(106, "Peter", "Petrov", 180, 40000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.size());
        assertFalse(company.addEmployee(firm[3]));
        employee = new SalesManager(106, "Vasia", "Ivanov", 180, 40000, 0.1);
        assertFalse(company.addEmployee(employee));

    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void size() {
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }
}