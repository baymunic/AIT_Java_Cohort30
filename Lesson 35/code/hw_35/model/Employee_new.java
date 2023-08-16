package hw_35.model;

import java.util.Objects;

public class Employee_new {
    // поля
    private String name;
    private int yearOfBirth;
    private int experience; // стаж работы
    private String education; // образование


    // конструктор
    public Employee_new(String name, int yearOfBirth, int experience, String education) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.experience = experience;
        this.education = education;
    }

    // геттеры

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getExperience() {
        return experience;
    }

    public String getEducation() {
        return education;
    }

    // сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    // to String

    @Override
    public String toString() {
        return "Employee_new{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", experience=" + experience +
                ", education='" + education + '\'' +
                '}';
    }

    // equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_new that = (Employee_new) o;
        return yearOfBirth == that.yearOfBirth && experience == that.experience && Objects.equals(name, that.name) && Objects.equals(education, that.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth, experience, education);
    }
}
