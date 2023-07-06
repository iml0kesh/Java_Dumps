package com.oops;

public class OOPSPolymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.animalSound();

        pig p = new pig();
        p.animalSound();

        dog d = new dog();
        d.animalSound();
    }
}

