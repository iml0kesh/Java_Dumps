package com.mathDumps;

import java.util.Scanner;

public class AmstrongNumber {

    public static int cubeRoot(int x){
        return x*x*x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num > 0){
            int lastDigit = num%10;
            sum = sum + cubeRoot(lastDigit);
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
