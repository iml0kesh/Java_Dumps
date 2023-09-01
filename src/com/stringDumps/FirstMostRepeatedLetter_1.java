package com.stringDumps;

import java.util.Scanner;

public class FirstMostRepeatedLetter_1 {

    public static char HelperFun(String s){
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return 'N';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(HelperFun(s));
    }
}
