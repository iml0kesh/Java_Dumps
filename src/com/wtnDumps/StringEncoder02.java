package com.wtnDumps;

import java.util.Scanner;

public class StringEncoder02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s[] = new String[]{s1, s2, s3};
        String s1f="",s1m="",s1l="",s2f="",s2m="",s2l="",s3f="",s3m="",s3l="";
        for(int i=0; i < s.length; i++){
            if(s[i].length() % 3 == 0){
                int n = s[i].length()/3;
                s1f = s1f + s[i].substring(0,n);
                s1m = s1m + s[i].substring(n,s[i].length()-n);
                s1l = s1l + s[i].substring(s[i].length()-n);
            }
            if(s[i].length() % 3 == 1){
                int n = s[i].length()/3;
                s2f = s2f + s[i].substring(0,n);
                s2m = s2m + s[i].substring(n,s[i].length()-n);
                s2l = s2l + s[i].substring(s[i].length()-n);
            }
            if(s[i].length() % 3 == 2){
                int n = s[i].length()/3;
                s3f = s3f + s[i].substring(0,n+1);
                s3m = s3m + s[i].substring(n+1,s[i].length()-n-1);
                s3l = s3l + s[i].substring(s[i].length()-n-1);
            }
        }

//        Output1: FRONT part of input 1 + MIDDLE part of input 2 + END part of input 3
        System.out.println(s2f + s3m + s1l);
//        Output2: MIDDLE part of input1 + END part of input2 + FRONT part of input3
        System.out.println(s2m + s3l + s1f);
//        Output3: END part of the input1 + FRONT part of input2 + MIDDLE part of input3
        System.out.println((s2l + s3f + s1m));
        String last = (s2l + s3f + s1m);
//        System.out.println(last);
        StringBuilder l = new StringBuilder(last);
        for(int i=0 ;i<last.length(); i++){
            char ch = l.charAt(i);
            if(Character.isLowerCase(ch)){
                l.setCharAt(i,Character.toUpperCase(ch));
            } else {
                l.setCharAt(i,Character.toLowerCase(ch));
            }
        }
        System.out.println(l);
    }
}
