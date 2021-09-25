package com.key.employee;

import org.junit.Assert;
import org.junit.Test;

public class testEmployee {

    public static void main(String[] args){
        Employee employee1 = new Employee(01, "John", "Patrick", 4500);
        Employee employee2 = new Employee(employee1);

        System.out.println(employee2.toString());
        System.out.println("John's salary is: $" + employee2.getAnnualSalary());
        System.out.println("Employee count: " + Employee.count);
        Assert.assertFalse("The employee count should be 2", Employee.count != 2);
        employee2.raiseSalary(20);
        System.out.println("John's salary after 20% raise is: " + employee2.getAnnualSalary());

        Assert.assertTrue(employee2.getAnnualSalary() == 64800);
        Assert.assertFalse(employee2.getAnnualSalary() != 64800);

        Employee employee3 = new Employee(02, "James", "Woodley", 5000);
        Employee employee4 = new Employee(employee3);

        System.out.println(employee4.toString());
        System.out.println("Jame's salary is: $" + employee4.getAnnualSalary());
        System.out.println("Employee count: " + Employee.count);
        employee4.raiseSalary(20);
        System.out.println("Jame's salary after 20% raise is: " + employee4.getAnnualSalary());

        Assert.assertFalse("James salary after raise should be 72000", employee4.getAnnualSalary() != 72000);

        System.out.println(employee4.getName());
        Assert.assertTrue(employee4.getFirstName() == "James");
        Assert.assertFalse(employee4.getFirstName() != "James");

        Assert.assertTrue("The name does not match", employee4.getName() == "James Woodley");
        Assert.assertFalse("The name does not match",employee4.getName() != "James Woodley");

    }
}
