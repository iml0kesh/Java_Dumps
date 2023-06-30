package com.wtnDumps;

import java.util.HashMap;

public class UnstableAndStableNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 1313, 122, 678, 898};
        int stable = 0, unstable = 0;
        for (int num : arr) {
            if(isStable(num)){
                stable++;
            } else {
                unstable++;
            }
        }
        System.out.println(stable +" "+unstable);
        System.out.println((unstable*10)+stable);
    }

    private static boolean isStable(int num) {
        boolean isStable = true;
        int[] freq = new int[10];
        String numstr = String.valueOf(num);

        for(int i=0; i<numstr.length(); i++){
            int digit = Integer.parseInt(String.valueOf(numstr.charAt(i)));
            freq[digit]++;
        }

        int freq1 = 0;
        for(int i=0; i<10; i++){
            if(freq1 < freq[i]){
                freq1 = freq[i];
                break;
            }
        }

        for(int i=0; i<10; i++){
            if(freq[i] != 0 && freq[i] != freq1){
                return false;
            }
        }
        return isStable;
    }
}
