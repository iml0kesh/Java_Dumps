package com.matrixDumps;

import java.util.Scanner;

public class matrixDump {
    static Scanner sc = new Scanner(System.in);

    public static int[][] readMat(){
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void printMat(int[][] x){
        for(int i=0; i<x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int[][] mulMat(int[][] m1, int[][]m2){
        int r1 = m1.length, c1 = m1[0].length, r2 = m2.length, c2 = m2[0].length;
        int [][] res = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(k = 0; k<r2 ; k++){
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args){

        int[][] m1 = new int[][];
        m1 = readMat();
        printMat(m1);
//        System.out.println(mulMat());

    }
}
