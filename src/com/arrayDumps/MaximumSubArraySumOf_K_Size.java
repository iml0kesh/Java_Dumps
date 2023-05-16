package com.arrayDumps;

import java.util.Scanner;

public class MaximumSubArraySumOf_K_Size {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0; i<k; i++){
                sum += arr[i];
            }
            max = sum;

            for (int j = 1; j <= (n-k); j++) {
                sum = sum - arr[j-1] + arr[j+k-1];
                max = Math.max(max, sum);
            }
            System.out.println(max);
            test--;
        }

    }

}
