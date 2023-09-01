package com.sortingDumps.mergeSortDumps;

import java.util.Scanner;

public class mergeSortConcept {

    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=high){
            temp[k++] = arr[j++];
        }
        for(int s = low,  p = 0; s<=high; s++, p++){
            arr[s] = temp[p];
        }
    }
    public static void mergeSortHelper(int[] arr,int low, int high){
        if(low>=high) return;
        int mid = low + (high-low)/2;
        mergeSortHelper(arr,low,mid);
        mergeSortHelper(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void mergeSort(int[] arr) {
        mergeSortHelper(arr,0,arr.length-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            mergeSort(arr);
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("\n");
            test--;
        }

    }
}
