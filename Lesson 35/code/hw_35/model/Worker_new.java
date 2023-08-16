package hw_35.model;

public class Worker_new extends Engineer_new{

    // поля
    private double hours;
    private double grade;

    // конструктор
    public Worker_new(String name, int yearOfBirth, int experience, String education, double baseSalary, double hours, double grade, double hours1, double grade1) {
        super(name, yearOfBirth, experience, education, baseSalary, hours, grade);
        this.hours = hours1;
        this.grade = grade1;
    }

    // геттеры
    @Override
    public double getHours() {
        return hours;
    }

    @Override
    public double getGrade() {
        return grade;
    }

    // сеттеры
    @Override
    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double calcSalary(){
        double salary = hours + grade;
        return salary;
    }
}
