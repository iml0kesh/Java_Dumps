package com.wtnDumps;

import java.util.Scanner;

public class UserIDGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String pin = sc.next();
        int n = sc.nextInt();


        String smallerName;
        String largerName;

        if(s1.length() > s2.length()){
            smallerName = s2;
            largerName = s1;
        } else if(s1.length() == s2.length()) {
            if(s1.compareTo(s2) > 1){
                largerName = s1;
                smallerName = s2;
            } else {
                largerName = s2;
                smallerName = s1;
            }
        } else {
            smallerName = s1;
            largerName = s2;
        }


        char ch = largerName.charAt(0);
        char num1 = pin.charAt(n-1);
        char num2 = pin.charAt(pin.length()-n);
        String finalW = ch + smallerName + num1 + num2;
        StringBuilder res = new StringBuilder(finalW);

        for(int i=0; i<res.length(); i++){
            if(Character.isUpperCase(finalW.charAt(i))){
                res.setCharAt(i,Character.toLowerCase(finalW.charAt(i)));
            } else {
                res.setCharAt(i,Character.toUpperCase(finalW.charAt(i)));
            }
        }
        System.out.println(res);
    }
}
