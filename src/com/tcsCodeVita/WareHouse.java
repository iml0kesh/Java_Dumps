package com.tcsCodeVita;

import java.util.*;
public class WareHouse {
    public static int helperFunction(int[] wts, int maxLimit) {
        int[] sortedWts = new int[wts.length];
        int i = 0;
        for (int wt : wts) {
            if (wt != 0) {
                sortedWts[i++] = wt;
            }
        }
        Arrays.sort(sortedWts, 0, i);
        reverseArray(sortedWts, 0, i - 1);

        int left = 0, right = i - 1;
        int vehicles = 0;

        while (left <= right) {
            if (sortedWts[left] + sortedWts[right] <= maxLimit) {
                right--;
            }
            left++;
            vehicles++;
        }

        return vehicles;
    }

    public static void reverseArray(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wtsInput = scanner.nextLine().split(" ");
        int[] wts = Arrays.stream(wtsInput).mapToInt(Integer::parseInt).toArray();
        int mxLimit = scanner.nextInt();
        int result = helperFunction(wts, mxLimit);
        System.out.println(result);
    }
}
