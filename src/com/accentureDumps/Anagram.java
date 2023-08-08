package com.accentureDumps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        Set<Character> Chars = new HashSet<>();
        for(int i=0; i<str1.length(); i++){
            Chars.add(str1.charAt(i));
            Chars.add(str2.charAt(i));
        }
        return Chars.size() == str1.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(isAnagram(str1, str2));
    }
}
