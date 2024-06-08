package com.allinone;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class programsMayAsk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // liner search
        int[] arr1 = new int[]{1,9,2,8,3,7,4,6,5,0};
        int value = 6;
        // linearSearch(arr1,value);


        // For prime
        // int n = sc.nextInt();
        // System.out.println(checkPrime(n));

        // Sort the array
        int[] arr2 = new int[]{1,9,2,8,3,7,4,6,5,0};
        // selectionSort(arr2);

        // Reverse an array
        int[] arr3 = new int[]{1,2,3,4,5,6,7,8,9,10};
        // reverseArray(arr3);

        String s = "abcheikhuidfubifvhb";
        charCount(s);
    }

    public static boolean checkPrime(int x){
        if(x <= 1){
            return false;
        } else {
            for(int i=2; i <= x/2; i++){
                if(x%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min_index = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while( i < j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void charCount(String s){
        HashMap<Character, Integer> mp1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            int value = 1;
            if(mp1.containsKey(key)){
                mp1.put(key,mp1.get(key) + 1);
            } else {
                mp1.put(key,value);
            }
        }

        for(Map.Entry<Character, Integer> entry : mp1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void linearSearch(int[] arr, int value){
        if(arr.length == 0) System.out.println("Empty array");
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                System.out.println("Found "+value+" at index "+i);
                break;
            }
        }
    }
}
