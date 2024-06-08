package com.oops.zirohLabs.encapsulation;

public class Student {
    private String Name;
    private int age;

    public Student(String name, int age){
        this.Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

