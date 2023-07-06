package com.javaExceptionHandling;

public class Throw1 {
    public static void main(String[] args) throws Exception {
        int age = 12;
        if(age < 18){
            throw new Exception("age less than 18");
        } else {
            System.out.println("You are eligible");
        }
    }
}
