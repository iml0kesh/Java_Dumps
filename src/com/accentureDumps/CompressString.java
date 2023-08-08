package com.accentureDumps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            int value = 1;
            if(map1.containsKey(key)){
                map1.put(key,map1.get(key)+1);
            } else {
                map1.put(key, value);
            }
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            System.out.print(entry.getKey()+""+entry.getValue());
            System.out.print(" ");
        }
    }
}
