package com.allinone;

public class linkedListt {
    class Node {
        int data;
        Node next;

        Node(int x){
            this.data = x;
        }
    }

    Node head;
    Node tail;

    public void addNode(int x){
        Node newNode = new Node(x);
        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail  = newNode;
    }

    public void printNodes() {
        Node temp = head;
        if(temp == null) System.out.println("No nodes availabe");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        linkedListt ll = new linkedListt();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.printNodes();
    }
}
