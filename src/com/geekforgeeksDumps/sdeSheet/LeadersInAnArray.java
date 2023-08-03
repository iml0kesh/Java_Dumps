package com.geekforgeeksDumps.sdeSheet;

import java.util.Scanner;

public class LeadersInAnArray {

    // Approach one Brute Force.
    // public static int
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {16, 17, 4, 3, 5, 2};
        for (int i=0; i<arr.length; i++){
            int j;
            for(j=i+1; j<arr.length; j++){
                if(arr[i] <= arr[j]){
                    break;
                }
            }
            if(j == arr.length){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
