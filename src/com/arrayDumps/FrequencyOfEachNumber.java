package com.arrayDumps;

import java.util.Scanner;

public class FrequencyOfEachNumber {
    public static void findFrequency(int[] a){
        int[] frequency = new int[101];
        for(int i=0 ;i<a.length; i++){
            frequency[a[i]]++;
        }
        for(int x:frequency){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        findFrequency(a);
    }
}
