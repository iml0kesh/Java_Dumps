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

            int max = 0;
            for (int i = 0; i <= n - k; i++) {
                int sum = 0;
                for (int j = i; j < k; j++) {
                    sum += arr[j];
                }
                max = Math.max(max, sum);
                System.out.print(max + " ");
            }
            System.out.println();
            test--;

        }

    }

}
