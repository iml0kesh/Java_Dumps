package com.wtnDumps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AddUniqueElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[]{1,2,3,4,5,6,7,8,9,0};
        int[] def = new int[]{1,23,5,68,9,0,19, 1,1,1,1,7,5};

        HashSet<Integer> unique = new HashSet<>();

        for(int num:abc){
            if(unique.contains(num)){
                unique.remove(num);
            } else {
                unique.add(num);
            }
        }

        for(int num:def){
            if(unique.contains(num)){
                unique.remove(num);
            } else {
                unique.add(num);
            }
        }

        System.out.println(unique);

        int sum = 0;
        for (Integer integer : unique) {
            sum += integer;
        }
        System.out.println(sum);

        while(sum > 0 && sum < 10){
            
        }

    }
}
