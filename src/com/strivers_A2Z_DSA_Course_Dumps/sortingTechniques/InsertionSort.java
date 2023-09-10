package com.strivers_A2Z_DSA_Course_Dumps.sortingTechniques;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j > -1 && arr[j] > arr[j+1]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
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

        insertionSort(arr);
    }
}
