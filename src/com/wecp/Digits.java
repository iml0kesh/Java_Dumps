package com.wecp;

import java.util.Scanner;

public class Digits {

    public static String HelperFun(String num1, String num2){
        char ArrNum1[] = num1.toCharArray(); // 4525 45 [_,_,2,5]
        char ArrNum2[] = num2.toCharArray();

        for(char c:ArrNum1) {
            System.out.print(c + " ");
        }

        for(char c:ArrNum2) {
            System.out.print(c + " ");
        }

        for(int i=0; i<num2.length(); i++){ // 5
            for(int j=0; j<num1.length(); j++){ // _525
                if(ArrNum2[i] == ArrNum2[j]){
                    ArrNum1[j] = '_';
                    break;
                }
            }
        }

        String res = "";
        for(char c : ArrNum1){
            if(c != '_'){
                res += c;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println(HelperFun(num1,num2));
    }
}
