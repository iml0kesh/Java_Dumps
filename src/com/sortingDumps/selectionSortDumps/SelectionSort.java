package com.sortingDumps.selectionSortDumps;

import java.util.Scanner;

public class SelectionSort {

    public static void SelectionSort(int[] arr){
        if(arr.length == 0) System.out.println("No elements in array");
        else {
            for(int i=0; i<arr.length; i++){
                int minIndex = i;
                for(int j=i+1; j< arr.length; j++){
                    if(arr[minIndex] > arr[j]){
                        minIndex = j;
                    }
                }
                if(i != minIndex){
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr);
    }
}
