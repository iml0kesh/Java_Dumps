package com.stackDumps;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static Stack <Character> st = new Stack<>();
    public static Boolean isValidParentheses (String s){
        for (int i=0; i<s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
            } else if ((st.peek() == '(' && s.charAt(i) == ')') || (st.peek() == '[' && s.charAt(i) == ']') || (st.peek() == '{' && s.charAt(i) == '}')) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        return st.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValidParentheses(s));
    }
}
