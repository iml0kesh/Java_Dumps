package com.singlelinkedListDumps;

public class MergeTwoSortedLists {
    class Node {
        int data;
        Node next;
        public Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNde(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node mergeTwoSortedLists(Node h1,Node h2){
        if(h1 == null && h2 == null){
            return null;
        }
        if(h2 == null){
            return h1;
        }
        if(h1 == null){
            return h2;
        }
        if(h1.data <= h2.data){
            h1.next = mergeTwoSortedLists(h1.next,h2);
            return h1;
        } else {
            h2.next = mergeTwoSortedLists(h1,h2.next);
            return h2;
        }
    }

    public static void main(String[] args) {

    }
}
