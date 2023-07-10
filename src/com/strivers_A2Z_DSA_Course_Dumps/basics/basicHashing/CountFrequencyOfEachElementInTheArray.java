package com.strivers_A2Z_DSA_Course_Dumps.basics.basicHashing;

import java.util.Scanner;

public class CountFrequencyOfEachElementInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[size];

        int count = 1;


        for (int i=0; i<size; i++){
            if (visited[i])
                continue;

            for (int j=1; j<size; j++){
                if(arr[i] == arr[j] ){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " Repeated "+ count +" Times");
            count = 0;
        }
    }
}
