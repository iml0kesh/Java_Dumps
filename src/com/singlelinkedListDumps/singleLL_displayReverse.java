package com.singlelinkedListDumps;

import java.util.HashSet;
import java.util.Random;

public class singleLL_displayReverse {

    class Node{
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
            System.out.println("Node added");
        } else {
            tail.next = newNode;
            tail = newNode;
            System.out.println("Node added");
        }
    }

    public void display(){
        Node current = head;

        if(current == null) return;

        while(current != null){
            System.out.print(current.data+"--->");
            current = current.next;
        }
        System.out.println("Null");
        System.out.println();
    }

    public void displayReverse(Node current){


        if(current == null) return;

        else{
            if(current.next==null){
                System.out.print(current.data+"-->");
                return;
            }

            displayReverse(current.next);
            System.out.print(current.data+"-->");
        }
    }

    public static void main(String[] args) {
        singleLL_displayReverse ssr = new singleLL_displayReverse();
        Random rr = new Random();
        HashSet<Integer> hs = new HashSet<>();
        int num = 0;
        while(num!=10){
            int n = rr.nextInt(10);
            if(hs.add(n)){
                ssr.addNode(n);
            }
            num++;
        }

        ssr.display();
        ssr.displayReverse(ssr.head);
    }

}
