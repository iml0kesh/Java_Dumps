package com.wtnDumps;

import java.util.Scanner;

public class KeyQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int l1 = largestNumber(n1);
        int l2 = largestNumber(n2);
        int l3 = largestNumber(n3);

        int s1 = smallestNumber(n1);
        int s2 = smallestNumber(n2);
        int s3 = smallestNumber(n3);

        int x1 = l1+l2+l3;
        int x2 = s1+s2+s3;

        System.out.println(x1+x2);
    }

    public static int largestNumber(int x){
        int max = 0;
        while(x > 0){
            int digit = x%10;
            if(max < digit){
                max = digit;
            }
            x /= 10;
        }
        return max;
    }

    public static int smallestNumber(int x){
        int min = x;
        while(x > 0){
            int digit = x%10;
            if(min > digit){
                min = digit;
            }
            x /= 10;
        }
        return min;
    }
}
