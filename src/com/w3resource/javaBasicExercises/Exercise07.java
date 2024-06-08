package com.w3resource.javaBasicExercises;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ;i<= 10; i++){
            System.out.println(n +" X " + i + " = "+ n * i);
        }
    }
}
