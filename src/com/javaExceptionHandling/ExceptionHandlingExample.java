package com.javaExceptionHandling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
           // code that may cause an exception.
        } catch (NullPointerException n){
            System.out.println("This is an Null Pointer exception");
        } catch (NumberFormatException | IndexOutOfBoundsException nf){
            System.out.println("This is an Number Format Exception");
        } catch (Exception e) {
            // code that we want to execute if exception came.
            System.out.println("Any kind of exception");
        }
    }
}
