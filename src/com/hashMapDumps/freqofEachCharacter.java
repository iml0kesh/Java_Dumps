package com.hashMapDumps;

import java.util.HashMap;
import java.util.Scanner;

public class freqofEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> freq = new HashMap<>();
        String s = sc.next();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            char key = c[i];
            int value = 1;
            if(freq.containsKey(key)){
                freq.put(key,freq.get(key)+1);
            }
            else{
                freq.put(key,value);
            }
        }
        System.out.println(freq);
    }
}
