package com.dynamicprogramming;

import java.util.Scanner;
import java.util.TreeSet;

public class LongestCommonSubsequenceLength {

    public static int LCS(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1+1][n2+1];

        for(int i=n1-1; i>=0; i--){
            for(int j=n2-1; j>=0; j--){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet <Integer> ts = new TreeSet<>();
        int t = sc.nextInt();
        String temp = sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            System.out.println(LCS(s1,s2));
        }
    }
}
