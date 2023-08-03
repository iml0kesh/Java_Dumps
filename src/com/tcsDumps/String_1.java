package com.tcsDumps;

import java.util.Arrays;
import java.util.Scanner;

public class String_1 {
    public static boolean isChar(char ch){
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int j = s.length()-1;
        char[] arr = s.toCharArray();
        System.out.println(arr);
        char arr1[] = new char[s.length()];
        while(i < j){
            if(isChar(s.charAt(i)) && isChar(s.charAt(j))){

            }
        }
        System.out.println(arr1);
    }
}
