package com.singlelinkedListDumps;

public class ReverseList {
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

    public Node reverseList(Node x){
        if(x == null) return null;
//        if(x.next == null) return x;
        Node current = x, prev = null, next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseList rl = new ReverseList();
        rl.addNode(5);
        rl.addNode(10);
        rl.addNode(15);
        rl.addNode(20);
        rl.addNode(25);
        Node reversedHead = rl.reverseList(rl.head);
        while(reversedHead   != null) {
            System.out.print(reversedHead.data+" ");
            reversedHead = reversedHead.next;
        }
    }
}
