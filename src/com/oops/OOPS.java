package com.oops;

// class = blueprint
class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // NON parameter
    Student() {
        System.out.println("constructor called");
    }

    // paramaeters
    Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student (Student s){
        this.name = s.name;
        this.age = s.age;
    }

}
public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // object of pen class.
        pen1.color = "Blue";
        pen1.type = "gel";

        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen(); // object of pen class.
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen2.write();
        pen2.printColor();


        Student s1 = new Student("lokesh",21); // object of student class. non-paramaterzed constructor.
        s1.name = "Lokesh";
        s1.age = 21;

        s1.printInfo();

        Student s2 = new Student(s1);

        s2.printInfo();
    }
}
