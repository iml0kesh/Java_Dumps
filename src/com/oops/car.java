package com.oops;

abstract class car {
    public abstract void car();
    public void start(){
        System.out.println("Car Started");
    }
}

class bwm extends car {
    public void car(){
        System.out.println("Bmw Started");
    };
}
