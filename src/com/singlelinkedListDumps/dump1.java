package com.singlelinkedListDumps;

public class dump1 {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
}
