package com.tcsDumps;

import java.util.Scanner;

public class PowerFour {

    public static boolean isPowerFour(int x){
        if(x == 0) return false;
        return ((x & (x-1)) == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPowerFour(number));
    }
}
