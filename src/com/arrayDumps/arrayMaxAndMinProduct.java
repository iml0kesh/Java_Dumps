package com.arrayDumps;

import java.util.Scanner;

public class arrayMaxAndMinProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            int x = sc.nextInt();
            if(x > max){
                max = x;
            }
            arr[i] = x;



        }

        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(max*min);
    }
}
