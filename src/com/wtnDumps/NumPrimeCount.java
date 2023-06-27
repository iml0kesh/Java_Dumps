package com.wtnDumps;

import java.util.Scanner;

public class NumPrimeCount {
    public static Boolean isPrime(int x){
        if(x == 0 || x == 1){
            return false;
        }
        for(int i=2; i<=x/2; i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int count = 0;
        for(int i=0; i<num.length(); i++){

            if(isPrime(Integer.parseInt(String.valueOf(num.charAt(i))))){
                count++;
            }
        }
        System.out.println(count);
    }
}
