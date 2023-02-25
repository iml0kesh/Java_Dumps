package com.leetcodeDumps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LC169 {

    public static int majorityElement(int [] a){
        int res = 0;
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
        for(int i=0; i<a.length; i++){
            h1.putIfAbsent(a[i],0);
            h1.put(a[i],h1.get(a[i])+1);
        }

        for(int i=0; i<a.length; i++){
            if(h1.get(a[i]) > (a.length/2)){
                res = a[i];
                break;
            }
        }

        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
}
