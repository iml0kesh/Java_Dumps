package com.leetcodeDumps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LC2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(countDistinctIntegers(arr));
            test--;
        }
    }

    private static int countDistinctIntegers(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            s.add(arr[i]);
            s.add(reverse(arr[i]));
        }
        return s.size();
    }

    private static int reverse(int x){
        int rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x /= x;
        }
        return rev;
    }

}
