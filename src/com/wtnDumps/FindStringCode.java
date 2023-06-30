package com.wtnDumps;

import java.util.Scanner;

public class FindStringCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        int num = 31;
        String[] arr = s.split(" ");
        for(String x:arr){
            int totalsum = 0;
            int i = 0;
            int j = x.length()-1;
            while(i < j){
                int pos = x.charAt(i) & num;
                int pos1 = x.charAt(j) & num;
                totalsum += Math.abs(pos - pos1);
                i++; j--;
            }
            if(x.length() % 2 != 0){
                totalsum += (x.charAt(x.length()/2) & num);
            }
            res.append(totalsum);
        }
        System.out.println(res);
    }
}
