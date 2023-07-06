package com.wtnDumps;

import java.util.HashMap;

public class UnstableAndStableNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 1313, 122, 678, 898};
        int stable = 0;
        int unStable = 0;
        for (int num : arr) {
            if (isStable(num)) {
                stable++;
            } else {
                unStable++;
            }
        }
        System.out.println((unStable * 10) + stable);
    }

    public static boolean isStable(int x){
        boolean isStable = true;
        int[] num = new int[10];

        while(x > 0){
            int digit = x % 10;
            num[digit]++;
            x /= 10;
        }

        int freq = 0;
        for(int i=0; i<10; i++){
            if(freq < num[i]){
                freq = num[i];
                break;
            }
        }

        for(int i=0; i<10; i++){
            if(num[i] != 0 && freq != num[i]){
                return false;
            }
        }
        return isStable;
    }
}
