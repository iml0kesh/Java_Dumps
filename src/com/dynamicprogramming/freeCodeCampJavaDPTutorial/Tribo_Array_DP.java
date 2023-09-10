package com.dynamicprogramming.freeCodeCampJavaDPTutorial;

import java.util.Scanner;

public class Tribo_Array_DP {

    public static int trib(int n){
        if(n == 0 || n == 1){
            return 0;
        }
        if(n == 2) return 1;

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        for(int i=3; i<n+1; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trib(n));
    }
}
