package com.singlelinkedListDumps;

import java.lang.*;
import java.util.HashSet;
import java.util.Random;

public class singleLL_countNodes {
    class Node {
        int data;
        Node next;

        public Node(int x){
            data = x;
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

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"--->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int countNodes(){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current=current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        singleLL_countNodes sc = new singleLL_countNodes();
        Random rr = new Random();
        HashSet<Integer> hs = new HashSet<>();

        int count = 0;
        while(count != 10){
            int num = rr.nextInt(10);
            if(hs.add(num)){
                sc.addNode(num);
                count++;
            }
        }
        sc.display();
        System.out.println("Totla Nodes are: "+sc.countNodes());

    }

}
