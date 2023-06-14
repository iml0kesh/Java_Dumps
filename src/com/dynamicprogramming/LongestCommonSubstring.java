package com.dynamicprogramming;

import java.util.Scanner;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int dp[][] = new int[s1.length()][s2.length()];

            int max = Integer.MIN_VALUE;
            for(int i=s1.length()-1; i>=0; i--){
                for(int j=s2.length()-1; j>=0; j--){
                    if(s1.charAt(i) == s2.charAt(j)){
                        dp[i][j] = 1 + dp[i+1][j+1];
                    } else {
                        dp[i][j] = 0;
                    }
                    max = Math.max(max,dp[i][j]);
                }
            }
            System.out.println(max);
        }
    }
}
