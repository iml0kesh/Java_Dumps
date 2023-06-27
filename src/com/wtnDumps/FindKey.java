package com.wtnDumps;

//key=(smallest at input1)*(largest at input2)*(largest at input3)+(positive number input 4)

import java.util.Scanner;

public class FindKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        smallNum(input1);
        int input2 = sc.nextInt();
        largeNum(input2);
        int input3 = sc.nextInt();
        largeNum(input3);

        int input4 = sc.nextInt();

        System.out.println((smallNum(input1)*largeNum(input2)*largeNum(input3) + input4));
    }
    public static int smallNum(int x){

        int small = x%10;
//        int temp  = x;
        while(x > 0){
            int digit = x%10;
            if(small >= digit){
                small = digit;
            }
            x/=10;
        }
//        System.out.println(small);
        return small;
    }

    public static int largeNum(int x){
        int large = x%10;
//        int temp  = x;
        while(x > 0){
            int digit = x%10;
            if(large <= digit){
                large = digit;
            }
            x/=10;
        }
//        System.out.println(large);
        return large;
    }
}
