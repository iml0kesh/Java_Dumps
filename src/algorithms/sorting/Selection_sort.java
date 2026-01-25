// Selection sort algorithm implementation in Java
package algorithms.sorting;


import java.util.Arrays;

public class Selection_sort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1; j<n-1; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {5,6,2,0,1,6,8};
        selectionSort(arr);

    }
}