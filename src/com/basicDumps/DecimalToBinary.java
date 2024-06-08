package com.basicDumps;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> store = new ArrayList<>();

        while(n > 0) {
            store.add(n%2);
            n = n / 2;
        }
        for (int x:store){
            System.out.println(x);
        }
    }
}
