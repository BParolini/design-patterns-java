package io.bparolini;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    private final String name;
    private final String dept;
    private final int salary;
    private final Set<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new HashSet<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    public Set<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]";
    }
}
