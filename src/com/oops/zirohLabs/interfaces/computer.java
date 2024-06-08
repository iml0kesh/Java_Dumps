package com.oops.zirohLabs.interfaces;

public interface computer {
    void os();
    void ram();
    void ssd();
}

class Laptop implements computer {
    public void os() {
        System.out.println("windows");
    }

    public void ram() {
        System.out.println("8 GB");
    }

    public void ssd() {
        System.out.println("512 GB");
    }
}

class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.os();
        l1.ram();
        l1.ssd();
    }
}
