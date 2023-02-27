package com.quickSortDumps;

import java.util.Scanner;

public class quickSortConcept {

    public static void quickSort(int[] arr, int start, int end){
        int n = arr.length;
        int pivot = arr[0];


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 1, size);
    }
}
