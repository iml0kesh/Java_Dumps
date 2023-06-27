package com.javaFundamentalsDump;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Invalid num");
        }
    }
}
