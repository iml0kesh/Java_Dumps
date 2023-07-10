package com.wtnDumps;

public class NonPrimeIndexSum {
    public static boolean isPrime(int x){
        if(x == 0 || x == 1) {
            return true;
        }

        for(int i=2; i<=x/2; i++){
            if(x%i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-4,-2};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(isPrime(i)){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}