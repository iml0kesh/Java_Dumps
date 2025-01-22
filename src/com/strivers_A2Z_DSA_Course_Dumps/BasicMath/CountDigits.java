package com.strivers_A2Z_DSA_Course_Dumps.BasicMath;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int c = 0;
        while(n != 0) {

            int fD = n % 10;

            System.out.println("single Digit " + fD);
            if(fD != 0 && temp%fD == 0) c++;

            n = n / 10;
            System.out.println("Changed number " + n);
        }
        System.out.println("Total Count " + c);
    }
}
