package com.singlelinkedListDumps;

import java.util.Scanner;

public class SLL_RemoveNode {
    class Node {
        int data;
        Node next;
        public Node (int x) {
            this.data = x;
            next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public static int count(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node RemoveMiddleNodes(Node head){
        if(head == null) return null;
        if(head.next == null) return head;
        int count = count(head);
        Node temp = head;
        Node last = null;
        while(temp != null){
            if(temp.next == null){
                head.next = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    public void addNode(int x){
        Node nn = new Node(x);
        if(head == null){
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        System.out.println("Node added");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL_RemoveNode n = new SLL_RemoveNode();
        n.addNode(1);
        n.addNode(2);
        n.addNode(3);
//        n.addNode(4);
        Node nn = RemoveMiddleNodes(n.head);
        while(nn != null){
            System.out.println(nn.data);
            nn = nn.next;
        }
    }
}
