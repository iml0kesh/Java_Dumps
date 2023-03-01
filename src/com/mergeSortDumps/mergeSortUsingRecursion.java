package com.mergeSortDumps;


import java.util.Arrays;

public class mergeSortUsingRecursion {
    public static void main(String[] args) {
        int a[] = new int[5];

        a = mergeSort(a);
    }

    public static int[] mergeSort(int[] a){
        int n = a.length;

        if(n==1){
            return a;
        }

        int mid = n/2;

        int first[] = mergeSort(Arrays.copyOfRange(a,0, mid));
        int second[] = mergeSort(Arrays.copyOfRange(a, mid, n));

        return merge(first,second);
    }

    public static int[] merge(int first[], int second[]){
        int[] sorted = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                sorted[k] = first[i];
                i++;
            } else {
                sorted[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            sorted[k] = first[i];
            i++;
            k++;
        }
        return sorted;
    }

}
