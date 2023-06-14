package com.stackDumps;


class StackArray {
    int top = -1;
    int capacity = 5;

    int arr[];
    public StackArray() {
        arr = new int[capacity];
    }

    public StackArray(int x) {
        arr = new int[x];
        capacity = x;
    }

    void push(int x){
        top++;
        if(top < capacity){
            arr[top] = x;
            System.out.println("Element added " + x);
        } else {
            System.out.println("Stack OverFLow");
        }
    };
    int pop(){
        if(top == -1){
            System.out.println("No elements to POP");
            return -1;
        }
        return arr[top--];
    }

    int peek(){
        if(top == -1){
            System.out.println("NO elements");
            return -1;
        } else {
            return arr[top--];
        }
    }

    int size(){
        return top+1;
    }

}
public class StackUsingArray {
    public static void main(String[] args) {
        StackArray sa = new StackArray();
        sa.push(56);
        sa.push(37);
        sa.push(67);
        sa.push(90);
        sa.push(100);
        sa.peek();
    }
}


