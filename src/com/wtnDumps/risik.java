package com.wtnDumps;

import java.util.Scanner;

public class risik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0) {
            String num = sc.next();
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            StringBuilder res = new StringBuilder();
            for(int i=0; i<num.length(); i++){
                if(i % 2 == 0){
                    even.append(num.charAt(i));
                } else {
                    odd.append(num.charAt(i));
                }
            }
            res.append(even.append(odd));
            System.out.println(res);
            n--;
        }
    }
}
