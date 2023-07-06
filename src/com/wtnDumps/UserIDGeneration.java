package com.wtnDumps;

import java.util.Scanner;

public class UserIDGeneration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String pin = sc.next();
        int n = sc.nextInt();

        int s1Length = s1.length();
        int s2Length = s2.length();

        String LargerName;
        String SmallerName;

        if (s1Length > s2Length){
            LargerName = s1;
            SmallerName = s2;
        } else if (s1Length == s2Length){
            if(s1.compareTo(s2) > 1){
                LargerName = s1;
                SmallerName = s2;
            } else {
                LargerName = s2;
                SmallerName = s1;
            }
        } else {
            LargerName = s2;
            SmallerName = s1;
        }

        char ch = LargerName.charAt(0);
        char pin1 = pin.charAt(n-1);
        char pin2 = pin.charAt(pin.length()-n);

        StringBuilder res = new StringBuilder();
        res.append(ch+SmallerName+pin1+pin2);
        System.out.println(res);

        for(int i=0; i<res.length(); i++){
            if(Character.isUpperCase(res.charAt(i))){
                res.setCharAt(i,Character.toLowerCase(res.charAt(i)));
            } else {
                res.setCharAt(i,Character.toUpperCase(res.charAt(i)));
            }
        }
        System.out.println(res);
    }
}

