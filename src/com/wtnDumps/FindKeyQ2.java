package com.wtnDumps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindKeyQ2 {

    public static int FindKey(int x){
        ArrayList<Integer> list = new ArrayList<>();
        while(x > 0){
            int digit = x % 10;
            list.add(digit);
            x /= 10;
        }
        int max = Collections.max(list);
        int min = Collections.min(list);

        return max - min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int arr[] = new int[]{a, b, c};
        int max = 0;

        for(int i=0; i<arr.length; i++){
            max += FindKey(arr[i]);
        }
        System.out.println(max);
    }
}
