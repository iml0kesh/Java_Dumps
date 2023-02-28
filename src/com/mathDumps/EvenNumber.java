package com.mathDumps;

import java.util.Scanner;

public class EvenNumber {

    public static boolean isEven(int x){
        if(x%2==0){
            return true;
        } else {
            return false;
        }
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
