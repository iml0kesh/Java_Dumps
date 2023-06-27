package com.dynamicprogramming;

import java.util.Scanner;

public class ComputeNCR  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[][] arr = new long[2001][2001];
        long mod = 1000000007;

        for(int i=0; i< arr.length; i++){
            arr[i][0] = 1;
            for (int j=0; j<arr.length; j++){
                if(i==j){
                    arr[i][j] = 1;
                }
            }
        }

        for (int i=2; i<2001; i++){
            for(int j=1; j<i; j++){
                arr[i][j] = (arr[i-1][j-1]%mod + arr[i-1][j]%mod)%mod;
            }
        }

//        int test = sc.nextInt();
//        while(test > 0){
//            int n = sc.nextInt();
//            int r = sc.nextInt();
//            System.out.println(arr[n][r]);
//            test--;
//        }

         for(int i=0; i<arr.length; i++){
             for (int j=0; j< arr.length; j++){
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
    }
}
