package com.accentureDumps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class rishik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(s.contains(num)){
                s.add(num+1);
                sum += num+1;
            } else {
                s.add(num);
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
