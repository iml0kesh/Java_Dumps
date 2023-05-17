package com.leetcodeDumps;


//This is approach one to find the middle element.
public class LC876 {
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

    public int countNodes(Node x){
        Node temp = x;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Node findMiddleElement(Node h){
        if(h == null) return null;
        if(h.next == null) return h;

        // count the nummber of Nodes
        int count = countNodes(h);

//        to print the 1 middle element ||
//        if(count % 2 == 0){
//            count = count / 2 - 1;
//        } else {
//            count /= 2;
//        }


//        to print the secomd middle element.
        count = count / 2;

        Node temp = h;
        while(count > 0){
            temp = temp.next;
            count--;
        }
        return temp;
    }

    public static void main(String[] args) {
        LC876 fm = new LC876();
        fm.addNode(3);
        fm.addNode(2);
        fm.addNode(10);
        fm.addNode(9);
        Node middleNode = fm.findMiddleElement(fm.head);
        System.out.println(middleNode.data);
    }
}

