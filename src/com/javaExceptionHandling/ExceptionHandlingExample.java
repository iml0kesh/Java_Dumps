package com.javaExceptionHandling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int data = 100/0;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Rest of the Code");
    }
}
