package com.leetcodeDumps;

import java.util.Scanner;

public class LC2414 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();

        String result = "";
        String prevRes = "";

        for(int i=1; i<given.length(); i++){
            if(given.charAt(i) - given.charAt(i-1) == 1){ // a = 97;
                result += given.charAt(i)+given.charAt(i-1);
            } else {
                if(result.length() >= prevRes.length()){
                    prevRes = result;
                }
                result = "";
            }
        }
        System.out.println(prevRes.length());
    }
}
