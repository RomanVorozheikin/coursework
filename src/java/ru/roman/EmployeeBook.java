package ru.roman;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void addEmployee(String fullName,int department, int salary) {
        Employee newEmployee = new Employee(fullName, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null&&id==employees[i].getId()) {
                employees[i]=null;
            }
        }
    }

    public void printEmployeeByDepartment() {
        System.out.println("Сотрудники первого отдела");
        for (Employee employee:employees) {
            if (employee != null && employee.getDepartment() == 1) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println("Сотрудники второго отдела");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == 2) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println("Сотрудники третьего отдела");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == 3) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println("Сотрудники четвертого отдела");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == 4) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println("Сотрудники пятого отдела");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == 5) {
                System.out.println(employee.getFullName());
            }
        }

    }

    public void changeSalaryEmployee(String fullName,int newSalaryEmployee) {
        for (Employee employee:employees) {
            if (employee != null && fullName.equals(employee.getFullName())) {
                employee.setSalary(newSalaryEmployee);
            }
        }
    }

    public void changeDepartmentEmployee(String fullName, int newDepartmentEmployee) {
        for (Employee employee:employees) {
            if (employee != null && fullName.equals(employee.getFullName())) {
                employee.setDepartment(newDepartmentEmployee);
            }
        }
    }

    public void printEmployeeDepartment(int department) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department) {
                System.out.println("Сотрудник: "+e.getFullName()+", Заработная плата: "+e.getSalary()+", ID: "+e.getId());
            }
        }
    }

    public void printInstalledSalaryMin(int number) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() < number) {
                System.out.println("Сотрудник: "+e.getFullName()+", Заработная плата: "+e.getSalary()+", ID: "+e.getId());
            }
        }
    }

    public void printInstalledSalaryMax(int number) {
        for (Employee e : employees) {
            if (e != null && e.getSalary() >= number) {
                System.out.println("Сотрудник: "+e.getFullName()+", Заработная плата: "+e.getSalary()+", ID: "+e.getId());
            }
        }
    }

    public Employee minSalaryDepartment(int department) {
        Employee min = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public Employee maxSalaryDepartment(int department) {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department && employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    public double sumSalaryDepartment(int department) {
        double sum = 0;
        for (Employee employee:employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double avgSalaryDepartment(int department) {
        double avg = 0;
        int count = 0;
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                count++;
                sum+=employee.getSalary();
                avg=sum/count;
            }
        }
        return avg;
    }

    public void indexSalaryDepartment(int department,int index) {
        double newSalaryDepartment;
        for (Employee employee:employees) {
            if (employee != null && employee.getDepartment() == department) {
                newSalaryDepartment = employee.getSalary() + employee.getSalary() * index * 0.01;
                employee.setSalary(newSalaryDepartment);
            }
        }
    }


    public int sumSalary() {
        int sum = 0;
        for (Employee employees : employees) {
            if (employees != null) {
                sum += employees.getSalary();
            }
        }
        return sum;
    }

    public void printEmployee() {
        for (Employee e : employees) {
                System.out.println(e);
        }
    }

    public Employee minSalary() {
        Employee min = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public Employee maxSalary() {
        Employee max = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i]!=null&&employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    public double avgSalary() {
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

    public void printFullName() {
        for (Employee employee:employees) {
            if (employee!= null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void indexSalary(double index) {
        double o;
        for (Employee employee:employees) {
            if (employee != null) {
                o = employee.getSalary()+employee.getSalary() * index*0.01;
                employee.setSalary(o);
            }
        }
    }
}
