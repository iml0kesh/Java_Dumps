package com.mathDumps;

import java.util.Scanner;

public class OddNumber {
    public static boolean isOdd(int x){
        if(x%2==0){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isOdd(num)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
