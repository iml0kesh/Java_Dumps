package com.dynamicprogramming.freeCodeCampJavaDPTutorial;

import java.util.Scanner;

public class Fibo_Array_DP {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<n+1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
