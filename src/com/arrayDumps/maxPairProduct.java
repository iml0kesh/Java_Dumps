package com.arrayDumps;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class maxPairProduct {
    public static int maxPairProduct(int[] arr){
        int max = Integer.MIN_VALUE;
        int SecondMAx = Integer.MIN_VALUE;
        int ThirdMax = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>max){
                ThirdMax = SecondMAx;
                SecondMAx = max;
                max = arr[i];
            } else if (arr[i] > ThirdMax && arr[i]>SecondMAx && arr[i] < max) {
                ThirdMax = SecondMAx;
                SecondMAx = arr[i];
            } else if (arr[i] > ThirdMax && arr[i]<SecondMAx && arr[i] < max) {
                ThirdMax = arr[i];
            }
        }
        return max*SecondMAx*ThirdMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            int x=sc.nextInt();
            if(x<0){
                x *= -1;
            }
            arr[i] = x;
        }
        System.out.println(maxPairProduct(arr));
    }
}
