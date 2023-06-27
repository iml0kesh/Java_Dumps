package com.hashMapDumps;

import java.util.*;

public class hashMapConcept {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<size; i++){
            arr[i] = sc.nextInt();
            int num = arr[i];
            h1.putIfAbsent(arr[i],0);
            h1.put(arr[i],h1.get(arr[i])+1);
        }

        System.out.println(h1);

        int pair = 0;
        for(Map.Entry<Integer,Integer> e : h1.entrySet()){
            if(e.getValue()%2==0){
                pair+=1;
            }
        }
        System.out.println(pair);
    }

}
