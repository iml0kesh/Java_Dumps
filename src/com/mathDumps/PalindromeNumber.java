package com.mathDumps;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int check = 0;
        while(num > 0){
            int lastDigit = num % 10;
            check = (check*10) + lastDigit;
            num /= 10;
        }

        if(temp == check) System.out.println("Yes");
        else System.out.println("NO");
    }
}
