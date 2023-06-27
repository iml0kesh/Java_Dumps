package com.wtnDumps;

import java.util.Scanner;

public class AvgRoundOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        int index = 0, sum = 0;
        while(n-- > 0){
            arr[index] = sc.nextInt();
            sum += arr[index];
            index++;
        }

        System.out.println(sum);
        double avg = (double) sum / arr.length;
        System.out.println(Math.round(avg));
    }
}
