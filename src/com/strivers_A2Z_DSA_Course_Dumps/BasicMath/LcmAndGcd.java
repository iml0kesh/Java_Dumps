package com.strivers_A2Z_DSA_Course_Dumps.BasicMath;

import java.util.Scanner;

public class LcmAndGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        lcmGcd(a,b);
    }

    private static void lcmGcd(int a, int b){
        // Lcm (Least common multiple means small number which can divide both).
        // GCD

        int lcm = 0;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i == 0 && b%i==0) lcm = i;
        }
        System.out.println("Lcm " + lcm);

        int gcd = a*b / lcm;
        System.out.println("gcd "+ gcd);
    }
}
