package com.accentureDumps;
import java.util.Scanner;
public class RatCountHouse {
    public static int RatHouse(int r, int unit, int n, int[] arr){
        if(n == 0) return -1;
        int foodReq = r*unit;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(foodReq <= sum) return i;
            sum += arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println(RatHouse(r,unit,n,arr));
    }
}
