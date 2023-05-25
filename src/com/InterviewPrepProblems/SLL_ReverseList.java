package com.InterviewPrepProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SLL_ReverseList {

    class Node {
        int data;
        Node next;
        public Node(int x){
            this.data = x;
            next = null;
        }

    }

    public static Node reverse(Node head){
        if(head == null) return null;
        Node prev = null, curr = head, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

    }
}
