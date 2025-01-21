package com.stringDumps;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  " i like this program very much ";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] words = s.split(" ");
        return reverse(words);
    }

    private static String reverse(String[] w){
        String[] revWords = new String[w.length];
        int p = 0;
        for(int i = w.length - 1; i>=0 ; i--){
            revWords[p++] = w[i];
        }
        return String.join(" ",revWords);
    }
}