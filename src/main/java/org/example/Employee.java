package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String phone;

    {
//        departments = new HashMap<>();
//        departments.put("Information", "IT");
//        departments.put("Human Resources", "HR");
//        departments.put("Sales", "Sales");

        departments = new LinkedHashMap<>();
        departments.put("Information", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");
    }

    public Employee(String firstName, String lastName, int salary, String department, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.phone = phone;
    }

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public Employee() {
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
