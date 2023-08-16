package hw_35.model;

public class Engineer_new extends Employee_new {

    // поля
    private double baseSalary;
    private double hours;
    private double grade;

    // конструктор
    public Engineer_new(String name, int yearOfBirth, int experience, String education, double baseSalary, double hours, double grade) {
        super(name, yearOfBirth, experience, education);
        this.baseSalary = baseSalary;
        this.hours = hours;
        this.grade = grade;
    }

    // геттеры
    public double getBaseSalary() {
        return baseSalary;
    }

    public double getHours() {
        return hours;
    }

    public double getGrade() {
        return grade;
    }

    // сеттеры
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double calcSalary(){
        double salary = hours + grade;
        return salary;
    }
}
