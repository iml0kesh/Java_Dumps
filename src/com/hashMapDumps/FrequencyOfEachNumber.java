package com.hashMapDumps;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfEachNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> freq = new HashMap<>();

        System.out.println("Enter the Size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Elements");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            int key = arr[i];
            int value = 1;
            if(freq.containsKey(key)){
                freq.put(key,freq.get(key)+1);
            } else {
                freq.put(key,value);
            }
        }

        System.out.println(freq);
    }
}
