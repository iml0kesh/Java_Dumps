package com.singlelinkedListDumps;

import java.util.Scanner;


//Java Program to create and display a singly linked list

public class singleLL {
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

    public void display(){
        Node current = head;
        if(current == null){
            System.out.println("Empty List ");
            return;
        }
        while(current != null){
            System.out.print(current.data+"--->");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        singleLL ssl = new singleLL();
        ssl.addNode(7);
        ssl.addNode(8);
        ssl.addNode(9);
        ssl.addNode(10);
        ssl.display();
    }
}
