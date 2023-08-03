package com.accentureDumps;

import java.util.Scanner;

public class Bitwise {

    public static int BitwiseHelper(String str){
//        First
        int res = str.charAt(0) - '0';
        for(int i=1; i<str.length(); i+=2){
            char op = str.charAt(i);
            int curr = str.charAt(i+1) - '0';
            if(str.charAt(i) == 'A'){
                res = res  & curr;
            }
            else if(op == 'B'){
                res = res | curr;
            } else if (op == 'C') {
                res = res ^ curr;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        System.out.println(BitwiseHelper(str));
    }
}
