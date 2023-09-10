package com.dynamicprogramming.freeCodeCampJavaDPTutorial;

import java.util.HashMap;
import java.util.Scanner;

public class Tribo_HashMap_DP {

    public static int trib(int x, HashMap<Integer, Integer> memo){
        if(x == 0 || x == 1){
            return 0;
        }
        if(x == 2){
            return 1;
        }
        if(memo.containsKey(x)){
            return memo.get(x);
        }
        int result = trib(x-1,memo) + trib(x-2) + trib(x-3,memo);
        memo.put(x,result);
        return result;
    }

    public static int trib(int n){
        return trib(n, new HashMap<>());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trib(n));
    }
}
