package io.bparolini;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    public void compositePatternTest() {
        var CEO = new Employee("John", "CEO", 30000);

        var headSales = new Employee("Robert", "Head Sales", 20000);

        var headMarketing = new Employee("Michel", "Head Marketing", 20000);

        var clerk1 = new Employee("Laura", "Marketing", 10000);
        var clerk2 = new Employee("Bob", "Marketing", 10000);

        var salesExecutive1 = new Employee("Richard", "Sales", 10000);
        var salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.addSubordinate(headSales);
        CEO.addSubordinate(headMarketing);

        headSales.addSubordinate(salesExecutive1);
        headSales.addSubordinate(salesExecutive2);

        headMarketing.addSubordinate(clerk1);
        headMarketing.addSubordinate(clerk2);

        printEmployeeAndSubordinates(CEO);

        Assertions.assertTrue(CEO.getSubordinates().contains(headSales));
        Assertions.assertTrue(CEO.getSubordinates().contains(headMarketing));

        Assertions.assertTrue(headMarketing.getSubordinates().contains(clerk1));
        Assertions.assertTrue(headMarketing.getSubordinates().contains(clerk2));

        Assertions.assertTrue(headSales.getSubordinates().contains(salesExecutive1));
        Assertions.assertTrue(headSales.getSubordinates().contains(salesExecutive2));
    }

    private void printEmployeeAndSubordinates(Employee employee) {
        System.out.println(employee);

        employee.getSubordinates().forEach(this::printEmployeeAndSubordinates);
    }
}
