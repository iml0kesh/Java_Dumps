package com.oops;

// Extending the variable , methods from one class to another class. Extending.
// Types of Inheritance
    // Single Inheritance.

// Base Class
class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

// Single Level
class Triangle extends Shape {
    public void area (int l, int h){
        System.out.println(1/2*l*h);
    }
}

// Multi Level
class EquilateralTriangle extends Triangle {

}

// hirearchial
class Circle extends Shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

// Hybrid Inhertiance


public class Inhertiance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();

    }
}
