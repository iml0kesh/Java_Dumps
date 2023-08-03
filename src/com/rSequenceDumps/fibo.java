package com.rSequenceDumps;

import java.util.Scanner;

public class fibo {

    public static void fiboo(int x) {
        int prev = 0;
        for(int i=0; i<x; i++){
            int newNum = prev + i;
            System.out.println(newNum);
            prev = newNum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fiboo(n);
    }
}
