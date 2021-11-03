package com.key.employee;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class testEmployee {

    @Test
    public void testGetId() {
        Employee employee1 = new Employee(01, "John", "Patrick", 4500);
        Assert.assertTrue(employee1.getID() == 1);
    }


    @Test
    public void testGetFirstName(){
        Employee employee2 = new Employee(02, "John", "Patrick", 4500);
        Assert.assertTrue(employee2.getFirstName() == "John");
    }

    @Test
    public void testGetLastName(){
        Employee employee3 = new Employee(03, "Tracy", "Paige", 4750);
        Assert.assertTrue(employee3.getLastName() == "Paige");
    }

    @Test
    public void testGetName(){
        Employee employee4 = new Employee(04, "Stan", "Nowlin", 4300);
        Assert.assertTrue(Objects.equals(employee4.getName(), "Stan Nowlin"));
    }

    @Test
    public void testGetSalary(){
        Employee employee5 = new Employee(05, "Morgan", "Miller", 4500);
        Assert.assertTrue(employee5.getSalary() == 4500);
    }

    @Test
    public void testSetSalary(){
        Employee employee6 = new Employee(06, "Richard", "Collins", 5000);
        // Set the salary
        employee6.setSalary(5000);
        Assert.assertTrue(employee6.getSalary() == 5000);
    }

    @Test
    public void getAnnualSalary(){
        Employee employee7 = new Employee(07, "Mike", "Morand", 5100);
        Assert.assertTrue(employee7.getAnnualSalary() == (12 * employee7.getSalary()));
    }

    @Test
    public void raiseSalary(){
        Employee employee8 = new Employee(8, "Lisa", "Boudreau", 5100);
        // Raise the salary
        employee8.raiseSalary(10);
        Assert.assertTrue(employee8.getSalary() == (5100 * 1.10));
    }

}

