package com.mathDumps;

import java.util.Scanner;

public class StarPattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=0 ; j<i; j++){
                if(i != num){
                    if(j==0 || j==i-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
