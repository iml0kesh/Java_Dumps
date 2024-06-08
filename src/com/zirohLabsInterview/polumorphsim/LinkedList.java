package com.zirohLabsInterview.polumorphsim;

public class LinkedList {
    class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insetNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        if(head == null) {
            System.out.println("Not elements");
        } else {
            while(head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insetNode(1);
        ll.insetNode(2);
        ll.insetNode(3);
        ll.display();
    }
}
