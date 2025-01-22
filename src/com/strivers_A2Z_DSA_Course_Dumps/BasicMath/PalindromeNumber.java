package com.strivers_A2Z_DSA_Course_Dumps.BasicMath;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0) System.out.println("False");

    }

    private boolean reverseNum(int x){
        int temp = x;
        int check = 0;
        while(x != 0) {
            int lastDigit = x % 10;
            check = check * 10 + lastDigit;
            x = x / 10;
        }

        return temp == check;
    }
}
