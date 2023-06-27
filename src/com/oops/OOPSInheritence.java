package com.oops;

import java.util.ArrayList;
import java.util.Scanner;


public class OOPSInheritence {

    static ArrayList<Employee> EmpList = new ArrayList<>();
    static ArrayList<Faculty> FacList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Select any One: 1.Employee 2.Faculty 3.Quit");
        int choice = sc.nextInt();
        while (choice != 3){
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter name of the Employee");
                    String Empname = sc.next();
                    System.out.println("Enter the Phone number of Employee");
                    String Empph = sc.next();
                    System.out.println("Enter the Address of Employee");
                    String Empadd = sc.next();
                    System.out.println("Enter the Org of Employee");
                    String Emporg = sc.next();
                    System.out.println("Enter The Salary OF Employee");
                    double Empsalary = sc.nextDouble();
                    System.out.println("Enter the DEs of the Emp");
                    String Empdes = sc.next();
                    Employee emp = new Employee(Empname, Empph, Empadd, Emporg, Empsalary, Empdes);
                    EmpList.add(emp);
                    System.out.println("Record Inserted Successfully");
                }
                case 2 -> {
                    System.out.println("Enter name of the Faculty");
                    String Fname = sc.next();
                    System.out.println("Enter the Phone number of Faculty");
                    String Fph = sc.next();
                    System.out.println("Enter the Address of Faculty");
                    String Fadd = sc.next();
                    System.out.println("Enter the Hours of faculty");
                    double hrs = sc.nextDouble();
                    System.out.println("Enter the wage/hour");
                    double wage = sc.nextDouble();
                    Faculty f = new Faculty(Fname, Fph, Fadd, hrs, wage);
                    FacList.add(f);
                    System.out.println("Record Inserted Successfully");
                }
                default -> System.out.println("Wrong Choice");
            }
            System.out.println("To insest another Record:");
            System.out.println("Select any One: 1.Employee 2.Faculty 3.Quit");
            choice = sc.nextInt();
        }
        System.out.println(EmpList);
        System.out.println(FacList);
    }
}

class Person {
    String name;
    String ph;
    String address;

    public Person() {

    }
}

class Employee extends Person {
    String org;
    double salary;
    String  des;

    public Employee(String name, String ph, String address, String org, double salary, String des){
        super.name = name;
        super.ph = ph;
        super.address = address;
        this.org = org;
        this.salary = salary;
        this.des = des;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "org='" + org + '\'' +
                ", salary=" + salary +
                ", des='" + des + '\'' +
                ", name='" + name + '\'' +
                ", ph='" + ph + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Faculty extends Person {
    double hrs;
    double wagePrHr;
    double totalWags;
    public Faculty(String name,String ph, String address,double hrs, double wagePrHr){
        this.name = name;
        this.ph = ph;
        this.address = address;
        this.hrs = hrs;
        this.wagePrHr = wagePrHr;
    }

    public double totalWags(double hrs, double wage){
         return  totalWags =  hrs*wage;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "hrs=" + hrs +
                ", wagePrHr=" + wagePrHr +
                ", totalWags=" + totalWags(hrs,wagePrHr) +
                ", name='" + name + '\'' +
                ", ph='" + ph + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
