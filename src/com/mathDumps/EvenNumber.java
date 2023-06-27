package com.mathDumps;

import java.util.Scanner;

public class EvenNumber {

    public static boolean isEven(int x){
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
