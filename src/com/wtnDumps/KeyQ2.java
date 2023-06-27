package com.wtnDumps;

import java.util.Scanner;

public class KeyQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();

        int num1 = Integer.parseInt(String.valueOf(n1.charAt(0)));
        int num2 = Integer.parseInt(String.valueOf(n2.charAt(1)));
        int num3 = largestNumber(Integer.parseInt(n3));

        System.out.println(num1+" * "+num2+" - "+num3+ " = " +((num1*num2) - num3));

    }
    public static int largestNumber(int x){
        int max = 0;
        while(x > 0){
            int digit = x%10;
            if(max < digit){
                max = digit;
            }
            x /= 10;
        }
        return max;
    }
}
