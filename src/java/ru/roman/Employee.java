package ru.roman;

public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private static int countId;
    private final int id;

    private static int incrementId() {
        return ++countId;
    }

    public Employee(String fullName, int department, int salary) {
        this.fullName=fullName;
        this.department=department;
        this.salary = salary;
        this.id=incrementId();
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department=department;
    }

    public String toString() {
        return "Сотрудник: " + getFullName() + ", Отдел: " + getDepartment() + ", Заработная плата: " + getSalary()+", ID: "+getId();
    }
}
