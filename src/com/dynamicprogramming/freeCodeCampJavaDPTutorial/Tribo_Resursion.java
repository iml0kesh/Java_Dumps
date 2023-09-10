package com.dynamicprogramming.freeCodeCampJavaDPTutorial;

import java.util.Scanner;

public class Tribo_Resursion {

    public static int trib(int x){
        if(x == 0 || x == 1){
            return 0;
        }
        if(x == 2) {
            return 1;
        }
        return trib(x - 1) + trib(x - 2) + trib(x - 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trib(n));
    }
}
