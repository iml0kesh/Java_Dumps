package com.wtnDumps;

import java.util.HashMap;
import java.util.Scanner;

public class FindTheSumOfUncommonNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[n2];
        for (int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n1; i++){
            int num = arr1[i];
            map.putIfAbsent(num, 0);
            map.put(num,map.get(num)+1);
        }
    }
}
