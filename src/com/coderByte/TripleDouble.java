package com.coderByte;

import java.util.Scanner;

public class TripleDouble {
    public static int TripleDoubleHelper (int num1, int num2) {
        String str1 = String.valueOf(num1);
        int max_len = 0;
        int c = 0;
        for(int i=0; i<str1.length()-1; i++){
            if(str1.charAt(i) == str1.charAt(i+1)){
                max_len++;
                c = str1.charAt(i);
            }
        }

        System.out.println(max_len+" "+(char)c);

        String str2 = String.valueOf(num2);
        for(int i=0; i<str2.length(); i++){
            if(str2.charAt(i) == str2.charAt(i) && str2.charAt(i) == (char) c){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(TripleDoubleHelper(465555,5579));
    }
}
