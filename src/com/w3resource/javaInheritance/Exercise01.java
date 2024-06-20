package com.w3resource.javaInheritance;

public class Exercise01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Cat c1 = new Cat();
        a1.makeSound();
        c1.makeSound();
    }
}

class Animal {
    public void makeSound(){
        System.out.println("This animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat makes pssppppsps");
    }
}