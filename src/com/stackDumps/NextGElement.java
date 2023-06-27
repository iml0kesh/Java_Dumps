package com.stackDumps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGElement {

    public static void nge(int[] arr){
        int[] res = new int[arr.length];
        Stack <Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while((!st.empty()) && (arr[i] > arr[st.peek()])){
                res[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        for(int x:res){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        nge(arr);
    }
}
