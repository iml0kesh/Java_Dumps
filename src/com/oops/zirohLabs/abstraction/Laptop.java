package com.oops.zirohLabs.abstraction;

public class Laptop extends computer{
    public void os(){
        System.out.println("Windows");
    }

}

class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.os();
        l1.ram();
    }
}
