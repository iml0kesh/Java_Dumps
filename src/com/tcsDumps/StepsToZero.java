package com.tcsDumps;

import java.util.Scanner;

public class StepsToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int fact = 1;
        while(num != 0){
            for(int i = 1; i<num; i++){
                if(num % i == 0){
                    fact = i;
                }
            }
            num = num - fact;
            count = count + 1;
        }
        System.out.println(count);
    }
}
