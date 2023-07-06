package com.oops;

public class Animal {
    public void animalSound(){
        System.out.println("The animal Sound will be: moooooooooo");
    }
}

class pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("pigggggggggggggggg");
    }
}

class dog extends  Animal {
    @Override
    public void animalSound() {
        System.out.println("BOw Bow Bow");
    }
}