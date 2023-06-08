package com.leetcodeDumps;

import java.util.Scanner;

public class LC2428 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        1st matrix sum
        int sum1 = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                sum1 += arr[i][j];
            }
        }

//      2nd Matrix sum
        int sum2 = 0;
        for(int i=1; i<n; i++){
            for(int j=0; j<n-1; j++){
                sum2+=arr[i][j];
            }
        }

//        3rd Matrix sum
        int sum3 = 0;
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n; j++){
                sum3 += arr[i][j];
            }
        }

//       4th Martix sum
        int sum4 = 0;
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                sum4 += arr[i][j];
            }
        }

        System.out.println(sum1+" "+sum2+" "+sum3+" "+sum4);

    }
}
