package com.allinone;

public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int a = 50/0;
        } catch(IndexOutOfBoundsException | NullPointerException idx) {
            System.out.println(idx);
        } catch(NumberFormatException nfe) {
            System.out.println(nfe);
        } catch (ArithmeticException ae){
            System.out.println(ae);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("After catch");
        }

        System.out.println("After finally");
    }
}
