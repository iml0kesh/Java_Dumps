package com.arrayDumps;

import java.util.Arrays;
import java.util.Scanner;

public class rightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int rotate = sc.nextInt();
        int rotations = rotate % n;
        System.out.println(rotations);
        for(int i=0; i<rotations; i++) {
            int temp = arr[n - 1];
            for (int j = n-1; j >=0 ; j--) {
                if(j-1>=0) {
                    arr[j] = arr[j - 1];
                }
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
