package com.tcsDumps;

import java.util.Scanner;

public class AutomationCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0) {
                arr[i] = 1;
                count++;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == 1) {
                        arr[j] = 0;
                    } else {
                        arr[j] = 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
