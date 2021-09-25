package com.key.employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    static int count = 0;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        count++;
    }

    public Employee(Employee e) {
        this.id = e.id;
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.salary = e.salary;
        count++;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary  * 12;
    }

    public double raiseSalary(int percent) {
        salary = salary + (salary * percent / 100);
        return salary;
    }

    public String toString() {
        return "Employee [id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", salary = " + salary + "]";
    }

}
