package com.w3resource.javaInheritance;

public class Exercise06 {
    public static void main(String[] args) {

    }
}

class Animal1 {
    public void move() {
        System.out.println("This animal moves");
    }
}

class Cheetah extends Animal1 {
    @Override
    public void move(){
        System.out.println("Cheetah runs");
    }

}