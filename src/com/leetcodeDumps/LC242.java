package com.leetcodeDumps;

public class LC242 {

    static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int[] alphabets = new int[26];

        for(int i=0; i < s.length(); i++){
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }

        for(int n : alphabets){
            if(n != 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
