package com.arrayListDumps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class addingElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rr = new Random();
        ArrayList<Integer> ar = new ArrayList<>();
        int i = 0;
        while(i!=10){
            ar.add(i,rr.nextInt(10));
            i++;
        }

        for(int x:ar){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(7/2);
    }
}
