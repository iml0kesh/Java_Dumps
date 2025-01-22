package com.strivers_A2Z_DSA_Course_Dumps.BasicMath;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                System.out.println(0);
            }
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
    }
}
