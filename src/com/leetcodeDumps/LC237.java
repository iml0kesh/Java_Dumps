package com.leetcodeDumps;

import com.singlelinkedListDumps.FindMiddleNode01;

public class LC237 {
    class Node{
        int data;
        Node next;
        public Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int x) {
        Node newNode = new Node(x);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void DeleteNode(Node x){
        x.data = x.next.data;
        x.next = x.next.next;
    }
}
