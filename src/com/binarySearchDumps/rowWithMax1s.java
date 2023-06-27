package com.binarySearchDumps;

import java.util.Scanner;

public class rowWithMax1s {

    public static int binarySearch(int[] arr){
        int res = 0; int k=1,first=0,last=arr.length-1;
        int mid = arr.length/2;
        while(first<=last){
            if(arr[mid]==1){
                res=mid;
                last=mid-1;
            } else first = mid+1;
                mid = (first + last)/2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int size = sc.nextInt();
            int[][] a = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            int res = size;
            for (int i = 0; i < size; i++) {
                int x = binarySearch(a[i]);
                if (res > x) {
                    res = x;
                }
            }
            System.out.println(res);
            t--;
        }

    }
}
