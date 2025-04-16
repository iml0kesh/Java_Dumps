package com.coderByte;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;


// Prime Number

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkPrime(n) ? "Prime" : "Not Prime");
    }

   static boolean checkPrime(int x) {
        if(x <= 1 ) return false;
        if(x == 2 || x == 3) return true;

        for(int i = 2; i<=x/i; i++) {
            if(x%i == 0) return false;
        }
        return true;
    }
}

// Palindrome Number

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(checkPaindrome(s) ? "Yes Palindrome" : "Not a Prlindrome");
    }

    static boolean checkPaindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

// Fibonacci Series

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    static int fibo(int x) {
        if(x == 0 || x == 1) return x;
        return fibo(x - 1) + fibo(x - 2);
    }
}


class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(
                fact(n)
        );
    }

    static int fact(int x){
        if (x == 0 || x == 1) return 1;
        return x * fact(x - 1);
    }
}

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armStrong(n) ? "Armstrong Number" : "Not an Armstrong Number");

        sc.close();
    }

    static boolean armStrong(int x){
        int sum = 0;
        int temp = x;
        while (temp > 0) {
            int digit = temp%10;
            sum += digit*digit*digit;
            temp /= 10;
        }
        return x == sum;
    }
}

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}

class SwapNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 2;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A: " + a);
        System.out.println("B: "+ b);

        int c = 3;
        int d = 4;

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("C: " + c);
        System.out.println("D: "+ d);


    }
}

class VowelsAndConsonants {
    public static void main(String[] args) {

        String s = "aeroplane";
        s = s.toLowerCase();
        int v = 0;
        int c = 0;

        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                v++;
            } else {
                c++;
            }
        }

        System.out.println("vowles: " + v +" Consonants: "+ c);
    }
}

class LargeAndSmall {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;

        for (int j : arr) {
            if (l <= j) l = j;
            if (s >= j) s = j;
        }

        System.out.println(
                "L: " + l +"\n"+ "S: " + s
        );
    }
}

class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "lokesh";
        String s2 = "lksoeh";

        int[] arr = new int[26];
        for(int i = 0; i<s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }

        String s = null;
        for(int x:arr){
           s = x != 0 ? "Not Anagram" : "anagram";
        }
        System.out.println(s);
    }
}


//File Handling in JAVA

class  FileHandling {
    public static void main(String[] args) {
        File newFile = new File("newFile.txt");
        System.out.println("file created");
    }
}

// Sorting Techniques
