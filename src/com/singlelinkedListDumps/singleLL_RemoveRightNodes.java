package com.singlelinkedListDumps;

public class singleLL_RemoveRightNodes {
    class Node {
        int data;
        Node next;
        public Node(int x){
            this.data = x;
            next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int x){
        Node nn = new Node(x);
        if(head == null){
            head = nn;
            tail = nn;
        } else {
            tail = nn;
            tail.next = nn;
        }
    }

//    public static Node removeRight(Node head){
//        Node temp = head;
////        Node next = h;
//        while(temp != null){
//
//        }
//    }

    public static void main(String[] args) {
        singleLL_RemoveRightNodes ssl = new singleLL_RemoveRightNodes();
        ssl.addNode(7);
        ssl.addNode(8);
        ssl.addNode(9);
    }
}
