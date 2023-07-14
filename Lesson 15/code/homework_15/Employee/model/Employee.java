package homework_15.Employee.model;

public class Employee {

    // поля класса Employee - переменная

    private String firstName;
    public String lastName;
    public long persNum;
    public String sex;
    public double salary;
    public int taxClass;

    // методы класса Employee
    // конструктор

    public Employee(String firstName, String lastName, long persNum, String sex, double salary, int taxClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.persNum = persNum;
        this.sex = sex;
        this.salary = salary;
        this.taxClass = taxClass;
    }

    public void display () {
        System.out.println("First Name: " + firstName + " | ");
        System.out.println("Last Name: " + lastName + " | ");
        System.out.println("Personal number: " + persNum + " | ");
        System.out.println("Sex: " + sex + " | ");
        System.out.println("Salary: " + salary + " | ");
        System.out.println("Tax Class: " + taxClass + " | ");
    }
    // геттеры и сеттеры

    public String getFirstName() {
        return this.firstName;
    } //

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPersNum() {
        return persNum;
    }

    public void setPersNum(long persNum) {
        this.persNum = persNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(int taxClass) {
        this.taxClass = taxClass;
    }
}
