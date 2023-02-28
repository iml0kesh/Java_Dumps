package com.mathDumps;

import java.util.Scanner;

public class LastDigitOfANumber {

    public static int lastDigit(int x){
        return x%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(lastDigit(num));
    }
}
