package com.stackDumps;

import java.util.*;

interface IStack{
    void push(int x) throws Exception;
    int pop() throws Exception;
    int top() throws Exception;
    int size();
    boolean isEmpty();
}



class Main{
    public static void main(String[] args) throws Exception{
        IStack stk = new MyStack1();
        stk.push(10);  stk.push(100);
        System.out.println(stk.size());
        while(!stk.isEmpty()){
            System.out.print(stk.pop() + " ");
        }
        System.out.println();
        System.out.println(stk.size());
        System.out.println(stk.top());
    }
}


class MyStack1 implements IStack{
    private int tp = -1;
    private int[] arr;
    private int capacity = 10;

    public MyStack1(){ // default constructor
        arr = new int[capacity];
    }

    public MyStack1(int cap){
        capacity = cap;
        arr = new int[capacity];
    }

    public boolean isEmpty(){ // O(1)
        return (tp == -1);
    }

    public int size(){ // O(1)
        return tp+1;
    }

    public int top() throws Exception{ // O(1)
        // 1. corner case - stk is empty
        if(tp == -1)
            throw new Exception("Stk empty");
        return arr[tp];
    }

    public void push(int x) throws Exception{ // O(1)
        // corner case - stack is full
        if(tp == capacity-1)
            throw new Exception("stk full");
        arr[++tp] = x;
    }

    public int pop() throws Exception{ // O(1)
        // corner case - stack is empty
        if(tp == -1)
            throw new Exception("Stk empty");
        return arr[tp--];
    }
}
