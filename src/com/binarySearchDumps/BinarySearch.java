package com.binarySearchDumps;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,5));
    }
    private static int binarySearch(int[] numbers, int value){
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high) {
            int middlePosition = (low + high) / 2;
            int middleValue = numbers[middlePosition];

            if(value == middleValue){
                return middlePosition;
            }
            if(middleValue > value){
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
