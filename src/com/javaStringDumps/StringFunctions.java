package com.javaStringDumps;

public class StringFunctions {
    public static void main(String[] args) {
        // Array Of Characters
//        char[] ch = {'j', 'a', 'v', 'a'};
//
//        // new object creation s.
//        String s = new String(ch);
//        System.out.println(s);

        // String is a sequence of characters.
        // in java string is an object that represents a sequence of characters.

        // Two ways to create a String injava.

//        String s2 = new String("Java");


        //There are Three ways to compare String in java:
        // 1. By Using equals() Method.
        // 2. By Using == Operator.
        // 3. By compareTo() Method.

        // By Using equals() Method.
        String s3 = "Java";
        String s4 = "Java";
        String s5 = "java";
        String s6 = "C++";

        System.out.println(s3.equals(s4)); // case alse
        System.out.println(s3.equals(s5)); // case false
        System.out.println(s3.equalsIgnoreCase(s5)); // IgnoresCase True

    }
 }
