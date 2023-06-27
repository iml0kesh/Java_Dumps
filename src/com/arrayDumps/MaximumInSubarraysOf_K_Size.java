package com.arrayDumps;

import java.util.Scanner;

public class MaximumInSubarraysOf_K_Size {

//    private static int maximumofsubarray(int arr[], int k){
//        int max = 0;
//
//        return max;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n ;i++){
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                max = arr[i];
                for(int j=i+1; j<=i+k-1; j++){
                    max = Math.max(max, arr[j]);
                }
                System.out.print(max+" ");
            }
            test--;
        }
    }
}
