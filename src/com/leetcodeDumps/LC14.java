package com.leetcodeDumps;

//
//14. Longest Common Prefix
//

import java.util.Scanner;

public class LC14 {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(String str : strs){
            while(str.indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for(int i=0; i<n; i++){
            strs[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(strs));
    }
}
