package com.w3resource.javaInheritance;

public class Exercise03 {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Rectangle r1 = new Rectangle(3.0,10.0);
        s1.getArea();
        double area = r1.getArea();
        System.out.println("Rectangle area is: "+ area);
    }
}

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
