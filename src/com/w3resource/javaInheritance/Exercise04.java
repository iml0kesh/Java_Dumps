package com.w3resource.javaInheritance;

public class Exercise04 {
    public static void main(String[] args) {

    }
}

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working as an employee");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("Managing employees");
    }

    public void addEmployee(){
        System.out.println("Adding employee");
    }
}