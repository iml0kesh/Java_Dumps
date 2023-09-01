package com.sortingDumps.bubbleSortDumps;

import java.io.IOException;
import java.util.Scanner;

public class BubbleSorting {

    public static void BubbleSort(int[] arr){
        if(arr.length == 0){
            System.out.print("No elements in array");
        } else {
            for(int i = arr.length - 1; i>=0; i--){
                for(int j = 0; j<i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) throws IOException {
//        InputStreamReader r = new InputStreamReader(System.in);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr);
    }
}
