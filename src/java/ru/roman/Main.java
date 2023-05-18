package ru.roman;

import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 120_000);
        employees[1] = new Employee("Иванов Иван Иванович2", 1, 130_000);
        employees[2] = new Employee("Иванов Иван Иванович3", 1, 140_000);
//        employees[3] = new Employee("Иванов Иван Иванович4", 3, 140_000);
//        employees[4] = new Employee("Иванов Иван Иванович5", 5, 150_000);
//        employees[5] = new Employee("Иванов Иван Иванович6", 5, 160_000);
//        employees[6] = new Employee("Иванов Иван Иванович7", 3, 170_000);
//        employees[7] = new Employee("Иванов Иван Иванович8", 2, 110_000);
//        employees[8] = new Employee("Иванов Иван Иванович9", 1, 110_000);
//        employees[9] = new Employee("Иванов Иван Иванович10", 2, 120_000);
        System.out.println("sumSalary() = " + sumSalary());
        printEmployee();
        System.out.println("minSalary() = " + minSalary());
        System.out.println("maxSalary() = " + maxSalary());
        System.out.println("avgSalary() = " + avgSalary());
        printFullName();

    }

    static int sumSalary() {
        int sum = 0;
        for (Employee employees : employees) {
            if (employees != null) {
                sum += employees.getSalary();
            }
        }
        return sum;
    }

    static void printEmployee() {
        for (Employee employee:employees) {
            if (employees!=null) {
                System.out.println(Arrays.toString(employees));
            }
        }
    }

    static Employee minSalary() {
        Employee min = employees[0];
            for (int i = 1; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getSalary() < min.getSalary()) {
                    min = employees[i];
                }
            }
        return min;
    }

    static Employee maxSalary() {
        Employee max = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i]!=null&&employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    static double avgSalary() {
        int count = 0;
        double sum=0;
        double avg=0;
        for (Employee employees : employees) {
            if (employees != null) {
                sum+= employees.getSalary();
                count++;
                avg=sum/count;
            }
        }
        return avg;
    }

    static void printFullName() {
        for (Employee employee:employees) {
            if (employee!= null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}