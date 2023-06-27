package com.leetcodeDumps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LC73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean[] rows = new boolean[r];
        boolean[] cols = new boolean[c];

        Arrays.fill(rows,false);
        Arrays.fill(cols,false);

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if (arr[i][j] == 0) {
                    rows[i] = true;
                    cols[i] = true;
                    break;
                }
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(rows[i] || cols[j]){
                    arr[i][j] = 0;
                }
            }
        }
    }
}
