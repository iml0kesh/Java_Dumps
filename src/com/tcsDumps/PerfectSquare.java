package com.tcsDumps;

import java.util.Scanner;

public class PerfectSquare {

    public static boolean isPrefectSquare(int x){
        if(x == 0) return true;
        for(int i=1; i<=x/2; i++){
            if(i*i == x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrefectSquare(number));
    }
}
