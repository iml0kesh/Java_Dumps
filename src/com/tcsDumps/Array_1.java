package com.tcsDumps;

//Given N stones, each stone has some weight assigned to it. A box with C capacity is also given.
// The task is to find out, the minimum number po/boxes which are e require the box.
//Note: C>Arr[0] to Arr[N], where Arr[i] represents the weight of ith stone.

import java.util.Scanner;

public class Array_1 {
    public static int HelperFunction(int n, int[] arr, int c){
        int box = 0;
        int currCap = c;
        for(int i=0; i<n; i++){
            if(arr[i] <= currCap){
                currCap -= arr[i];
            } else {
                box++;
                currCap = c - arr[i];
            }
        }
        if(currCap<c){
            box++;
        }
        return box;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]  =sc.nextInt();
        }
        int c = sc.nextInt();
        System.out.println(HelperFunction(n,arr,c));
    }
}
