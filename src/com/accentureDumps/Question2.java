package com.accentureDumps;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int itr = sc.nextInt();
        int[] arr = new int[size];
        Arrays.fill(arr,0);

       while(itr-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int i=a-1; i<b; i++){
                arr[i] += c;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
