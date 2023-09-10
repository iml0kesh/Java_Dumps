package com.dynamicprogramming.freeCodeCampJavaDPTutorial;

import java.util.Scanner;

public class Fibo_Recursion {

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}

// Time Complexity = O(2^n);
// Space Complexity = O(n);
