package com.leetcodeDumps;

import java.util.Scanner;

public class LC27 {
    private static int removeVal(int[] arr, int val){
        int pos = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[pos] = arr[i];
                pos++;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        System.out.println(removeVal(arr,val));
    }
}
