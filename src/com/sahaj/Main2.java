package com.sahaj;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] h = new long[(int) n];
        long max = 0;
        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
            if(h[i] > max) {
                max =  h[i];
            }
        }
        long days = 0;
        for(long num:h){
            long rem = num%max;
            days += (max - rem);
            System.out.println(rem);
        }
        System.out.println(days);
    }
}
