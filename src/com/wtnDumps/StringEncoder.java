package com.wtnDumps;
import java.util.Arrays;
public class StringEncoder {
    public static String[] stringEncoder(String[] input1, int input2){
        int size = input1.length;
        String[] ans = new String[size];
        int i = 0, loop;

        for (String s : input1) {
            loop = input2;
            char first = s.charAt(0);
            char middle = s.charAt(s.length() / 2);
            char last = s.charAt(s.length() - 1);

            String temp = first + String.valueOf(middle) + last;
            while (loop-- > 0) {
                temp += temp;
            }
            ans[i++] = temp;
        }

        return ans;
    }
    public static void main(String[] args) {
        String[] input1 = new String[]{"Hello", "World", "Madam"};
        int input2 = 2;
        System.out.println(Arrays.toString(stringEncoder(input1, input2)));
    }
}