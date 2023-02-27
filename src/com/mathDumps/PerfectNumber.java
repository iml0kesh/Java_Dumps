package com.mathDumps;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(num == sum) System.out.println("YES");
        else System.out.println("NO");
    }
}
