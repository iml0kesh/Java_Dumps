package com.w3resource.javaInheritance;

public class Exercise02 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        v1.drive();
        c1.drive();
    }
}

class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}