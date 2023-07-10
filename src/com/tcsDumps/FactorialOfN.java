package com.tcsDumps;

import java.util.Scanner;
public class FactorialOfN {
    public static long factorial(long x){

        if(x == 1) {
            return 1;
        }
        return (x * factorial(x - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        long fact = factorial(number);
        System.out.println(fact);
        long count = 0;
        while(fact > 0){
            if(fact%10 > 0){
                break;
            }
            else if(fact%10 == 0){
                count++;
            }
            fact /= 10;
        }
        System.out.println(count);
    }
}
