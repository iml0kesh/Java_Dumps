package com.leetcodeDumps;

//import com.singlelinkedListDumps.ReverseList;

public class LC206 {
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
        Node current = head, prev = null, next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        LC206 rl = new LC206();
        rl.addNode(5);
        rl.addNode(10);
        rl.addNode(15);
        rl.addNode(20);
        rl.addNode(25);
        Node ReversedHead = rl.reverseList(rl.head);
        while(ReversedHead != null){
            System.out.print(ReversedHead.data + " ");
            ReversedHead = ReversedHead.next;
        }
    }
}
