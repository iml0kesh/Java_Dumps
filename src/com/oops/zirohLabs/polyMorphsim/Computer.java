package com.oops.zirohLabs.polyMorphsim;

public class Computer {
    public void os() {
        System.out.println("Unix");
    }
}

class Laptop extends Computer {
    public void os() {
        System.out.println("Windows");
    }
}

class Mobile extends Computer {
    public void os() {
        System.out.println("Andriod");
    }
}

class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.os();

        Computer c2 = new Laptop();
        c2.os();

        Computer c3 = new Mobile();
        c3.os();
    }
}
