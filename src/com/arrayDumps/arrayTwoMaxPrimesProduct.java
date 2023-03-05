package com.arrayDumps;

import java.util.Scanner;

public class arrayTwoMaxPrimesProduct {
        public static boolean isPrime(int x){
            boolean isPrime = true;
            if(x<1){
                isPrime = false;
            } else {
                for (int i = 2; i <= x / 2; i++) {
                    if (x % i == 0) {
                        isPrime = false;
                    }
                }
            }
            return isPrime;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
            int arr[] = new int[]{3,5,7,12,16};
            int maxPrime = Integer.MIN_VALUE, SecondmaxPrime = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                int x = arr[i];
                if(isPrime(x)){
                    SecondmaxPrime = maxPrime;
                    maxPrime = x;
                }
                arr[i] = x;
            }
            System.out.println(maxPrime);
            System.out.println(SecondmaxPrime);
            System.out.println(SecondmaxPrime*maxPrime);
        }
    }
