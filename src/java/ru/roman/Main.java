package ru.roman;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        EmployeeBook employeeBook=new EmployeeBook();
        employeeBook.addEmployee("Иванов Иван Иванович", 2, 120_000);
        employeeBook.addEmployee("Иванов Иван Иванович2", 2, 130_000);
        employeeBook.addEmployee("Иванов Иван Иванович3", 1, 140_000);
        employeeBook.addEmployee("Иванов Иван Иванович4", 1, 140);
        employeeBook.addEmployee("Иванов Иван Иванович5", 5, 150);
        employeeBook.addEmployee("Иванов Иван Иванович6", 3, 160_000);
        employeeBook.addEmployee("Иванов Иван Иванович7", 3, 170_000);
        employeeBook.addEmployee("Иванов Иван Иванович8", 3, 110_000);
        employeeBook.addEmployee("Иванов Иван Иванович9", 1, 1100000);
        employeeBook.addEmployee("Иванов Иван Иванович10", 2, 120);
        employeeBook.changeSalaryEmployee("Иванов Иван Иванович6", 150);
        employeeBook.changeDepartmentEmployee("Иванов Иван Иванович4", 1);
//        System.out.println("employeeBook.maxSalary() = " + employeeBook.maxSalary());
//        System.out.println("employeeBook.avgSalaryDepartment(1) = " + employeeBook.avgSalaryDepartment(1));
//        employeeBook.printEmployeeByDepartment();
//        System.out.println("employeeBook.sumSalary() = " + employeeBook.sumSalary());
        employeeBook.printEmployee();
        employeeBook.deleteEmployee(8);
        employeeBook.printEmployee();
    }
}