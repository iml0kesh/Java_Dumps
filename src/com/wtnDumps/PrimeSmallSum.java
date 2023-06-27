package com.wtnDumps;

import java.util.Scanner;

public class PrimeSmallSum {
    public static int minPrime = 0;
    public static boolean isPrime(int x){
        if(x == 1 || x == 2){
            return true;
        } else {
            for(int i=2; i<=x/2; i++){
                if(x%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            if(isPrime(arr[i])){
                int checkMin = arr[i];
                if(minPrime > checkMin){
                    minPrime = checkMin;
                }
                sum += arr[i];
            }

        }
        System.out.println(minPrime);
        System.out.println(sum);
        System.out.println(sum - minPrime);
    }
}
