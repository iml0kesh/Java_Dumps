package com.allinone;

public class dataTypes {
    public static void main(String[] args) {
        byte one;
        int two;
        long three;
        float four;
        double five;
        char six;
        boolean seven;
        short eight;

        int a = 5;
        double d = a;
        System.out.println(d); // type conversion

        int b = (int) d; // type casting
        System.out.println(b);
    }
}
