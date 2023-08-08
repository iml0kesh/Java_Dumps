package com.accentureDumps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        Map<Integer,Integer> mp1 = new HashMap<>();
        for (int i=0; i<n; i++){
            int num = sc.nextInt();
            int value = 1;
            arr[i] = num;
            if(mp1.containsKey(num)){
                mp1.put(num,mp1.get(num)+1);
            } else {
                mp1.put(num,value);
            }
        }

        for (Map.Entry<Integer, Integer> entry : mp1.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey()+" ");
            }
        }

        for (Map.Entry<Integer, Integer> entry : mp1.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
