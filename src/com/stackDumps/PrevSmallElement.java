package com.stackDumps;

import java.util.Scanner;
import java.util.Stack;

public class PrevSmallElement {

    public static void pse(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        for(int i= arr.length-1; i>=0; i--){
            while(!st.empty() && arr[i] < arr[st.peek()]){
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
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pse(arr);
    }
}
