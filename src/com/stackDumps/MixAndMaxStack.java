package com.stackDumps;

import java.util.Scanner;
import java.util.Stack;

public class MixAndMaxStack {

    public static void minAndMax(int[] arr){
        Stack<Integer> max = new Stack<>();
        max.push(arr[0]);

        Stack<Integer> min = new Stack<>();
        min.push(arr[0]);

        int[] maxRes = new int[arr.length];
        int[] minRes = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            if(arr[i] >= max.peek()){
                max.pop();
                max.push(arr[i]);
            }
            maxRes[i] = max.peek();

            if(arr[i]<= min.peek()){
                min.pop();
                min.push(arr[i]);
            }
            minRes[i]=min.peek();
        }

        for(int x:maxRes){
            System.out.print(x+" ");
        }

        System.out.println();

        for(int x:minRes){
            System.out.print(x+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            minAndMax(arr);
            System.out.println();
        }
    }
}
