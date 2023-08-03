package com.wtnDumps;

import java.util.Scanner;

public class FixTheFormula {
    public static  int fixTheFormula(String input1) {
        if(input1.length() < 0) return  -1;
        StringBuilder oprs = new StringBuilder();
        StringBuilder nums = new StringBuilder();
        
        for(int i=0; i<input1.length(); i++){
            if(input1.charAt(i) == '+'|| input1.charAt(i) == '*' || input1.charAt(i) == '-' || input1.charAt(i) == '/'){
                oprs.append(input1.charAt(i));
            } else if (input1.charAt(i) > '0' && input1.charAt(i) <= '9') {
                nums.append(input1.charAt(i) - '0');
            }
        }

        System.out.println(oprs);
        System.out.println(nums);

        int num1 = nums.charAt(0) - '0';
        System.out.println("num1 " + num1);

        int num2 = nums.charAt(1) - '0';
        System.out.println("num2 " + num2);

        char op = oprs.charAt(0);


        int res=0;
        if(op == '+'){
            res = num1 + num2;
        } else if (op == '-'){
            res = num1 - num2;
        } else if (op == '*') {
            res = num1 * num2;
        } else {
            res = num1 / num2;
        }
        System.out.println(res);


        int j = 2;
        for(int i=1; i<oprs.length(); i++){
            op = oprs.charAt(i);
            if(op == '+'){
                res += (nums.charAt(j) - '0');
                j++;
            } else if (op == '-'){
                res -= (nums.charAt(j) - '0');
                j++;
            } else if (op == '*') {
                res *= (nums.charAt(j) - '0');
                j++;
            } else {
                res /= (nums.charAt(j) - '0');
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Fo+23the3*like2+";
        System.out.println(fixTheFormula(str));
    }
}
