package com.w3resource.javaInheritance;

public class Exercise07 {
    public static void main(String[] args) {
//        Employee1 ep1 = new Employee1();
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}

class Employee1 extends Person {
    private String jobTitle;
    private int EmployeeId;

    public Employee1 (String firstName, String lastName, String jobTitle, int EmployeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.EmployeeId = EmployeeId;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() +" "+ jobTitle;
    }
}