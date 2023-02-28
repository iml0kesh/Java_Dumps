//1) Java Program to copy all elements of one array into another array

package com.arrayDumps;

import java.util.Scanner;

public class CopyArray {

    public static void copyArray(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array one elements:- ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int arr2[] = new int[n];
        copyArray(arr,arr2);

        System.out.println("Arrray 2 Elemets");
        for(int x:arr2){
            System.out.print(x+" ");
        }
    }
}
