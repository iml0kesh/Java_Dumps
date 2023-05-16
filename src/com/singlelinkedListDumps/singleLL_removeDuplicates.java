package com.singlelinkedListDumps;


public class singleLL_removeDuplicates {
    class Node {
        int data;
        Node next;

        public Node(int x) {
            data = x;
            next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node removeDuplicates(Node head){
        if(head == null || head.next ==  null){
            return head;
        }
        while(head.next != null){
            if(head.data == head.next.data){
                head = head.next.next;
            } else {
                head = head.next;
            }
        }
        return head;
    }
    public void printList(Node head){
        if(head == null || head.next == null) {
            System.out.println(head.data);
        }

        while(head.next != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        singleLL ssl = new singleLL();
        ssl.addNode(7);
        ssl.addNode(8);
        ssl.addNode(9);
//        singleLL_removeDuplicates.addNode(10);
//        ssl.();
    }
}
