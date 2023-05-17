package com.leetcodeDumps;


public class LC876_2 {
    class Node{
        int data;
        Node next;

        public Node(int x) {
            this.data = x;
            this.next = null;
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

    public Node findMiddleElement(Node x){
        if(x == null) return null;
        Node fast = x;
        Node slow = x;
        while(fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
//        return slow; // This will return the middle Element for ODD size List and 1st middle Element in EVEN Size List.

        if(fast.next == null){
            return slow; // ODD case MIDDLE ELEMENT.
        } else {
            return slow.next; // EVEN case 2nd Middle.
        }


    }
    public static void main(String[] args) {
        LC876_2 fm = new LC876_2();
        fm.addNode(3);
        fm.addNode(2);
        fm.addNode(10);
        fm.addNode(9);
        Node middleNode = fm.findMiddleElement(fm.head);
        System.out.println(middleNode.data);
    }
}
