package com.allinone;

import java.util.Scanner;

public class controlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > y) {
            System.out.println("x is big");
        } else if(x == y){
            System.out.println("x == y");
        } else {
            System.out.println("Y is big");
        }

        int z = sc.nextInt();
        switch(z){
            case 1:
                System.out.println("z = 1");
                break;
            case 2:
                System.out.println("Z == 2");
                break;
            default:
                System.out.println("Invalid");
        }

        int a = sc.nextInt();
        System.out.println(a > 3 ? "Greater then 3" : "Less than 3");
    }
}
