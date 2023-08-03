package com.accentureDumps;

import java.util.Objects;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        String[][] matrix = new String[r][c];
        for(int i=0;i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.next();
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(Objects.equals(matrix[0][0], String.valueOf('w')) || Objects.equals(matrix[0][j-1],String.valueOf('w'))) {
                    System.out.println("UnStable");
                }
            }
        }
    }
}
