package com.tcsDumps;

import java.util.Scanner;

public class PowerTwo {

//    public static boolean isPowerTwo(int x){
//        if(x == 0) return false;
//        int sum = 1;
//        for(int i=1; i<x; i++){
//            for(int j = i; j>0; j--){
//                if((sum *= 2) == x){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static boolean isPowerTwo(int x){
        return (x & (x - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPowerTwo(number));
    }
}
