package com.leetcodeDumps;

import java.util.Scanner;

public class LC2413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit1 = sc.nextInt();
        if(digit1%2 == 0) System.out.println(digit1);
        else System.out.println(digit1*2);
    }
}


/*

class Solution {
    public int smallestEvenMultiple(int n) {
        if(1 <= n && n <=150){
            if(n%2==0) return n;
            else return n*2;
        }
        return 0;
    }
}

 */