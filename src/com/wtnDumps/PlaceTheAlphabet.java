package com.wtnDumps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlaceTheAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input_array = new int[n];
        int[] temp_array = new int[n];

        for(int i=0; i<n; i++){
            input_array[i] = sc.nextInt();
            temp_array[i] = input_array[i];
        }

        Arrays.sort(temp_array);
        System.out.println(Arrays.toString(temp_array));

        int alpha = 'a';

        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map1.containsKey(temp_array[i])){
                map1.put(temp_array[i],alpha++);
            }
        }

        System.out.println(map1);

        for (int i=0; i<n; i++){
            int ch = map1.get(input_array[i]);
            System.out.print((char)ch);
        }
    }
}
