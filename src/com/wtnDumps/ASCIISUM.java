package com.wtnDumps;

import java.util.Scanner;

public class ASCIISUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        char first = s1.charAt(0);
        char last = s1.charAt(s1.length()-1);
        if(isChar(first) && isChar(last)){
            int sum = first + last;
            System.out.println(sum);
        } else {
            System.out.println(1);
        }
    }

    public static boolean isChar(char x){
        if(x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z'){
            return true;
        }
        return false;
    }
}
