package com.accentureDumps;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println(maxOfArray(arr,n,0,arr[0]));
    }

    public static  int maxOfArray(int[] arr,int size, int i, int max){
        if(i == size){
            return max;
        }
        if(max < arr[i]){
            max = arr[i];
        }
        return maxOfArray(arr,size, i+1, max);
    }
}
