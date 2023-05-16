package com.leetcodeDumps;

import java.util.Scanner;

public class LC53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += arr[i];
                max = Math.max(max,sum);
            }
            if(sum < 0) sum = 0;
            System.out.println(max);
            test--;
        }
    }
}
