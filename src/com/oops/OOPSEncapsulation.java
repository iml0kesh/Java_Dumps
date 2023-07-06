package com.oops;

import java.util.Scanner;

public class OOPSEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank();
        String name = sc.next();
        b1.setName(name);
        System.out.println(b1.getName());
    }
}


