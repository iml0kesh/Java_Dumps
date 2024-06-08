package com.allinone;

public class methodsAndConstructors {
    public static void main(String[] args) {

    }

    // method loading with name and different parameters
    public int sum (int a, int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    // method overriding using superclass and subclass
    public int operation(int a, int b){
        return a * b;
    }
}

class subclass extends methodsAndConstructors{
   public int operation(int a, int b){
       return a/b;
   }
}
