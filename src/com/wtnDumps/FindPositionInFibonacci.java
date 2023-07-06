package com.wtnDumps;

import java.util.Scanner;

public class FindPositionInFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean found = true;

        if(x == 0){System.out.println(1);}

        int prev = 0;
        int next = 1;
        int length = 1;
        while(found){
            if(x == next){
                found = false;
                System.out.println(length+1);
            } else {
                int temp = next;
                next = next + prev;
                prev = temp;
                length++;
            }
        }
    }
}