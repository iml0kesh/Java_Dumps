package com.singlelinkedListDumps;

import java.util.HashSet;
import java.util.Random;

public class singleLL_deleteNodeAtBeginning {

    static class Node{
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
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("Node Added");
    }


    public void display(){
        Node current = head;
        if(current == null) return;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public void displayReverse(Node current){
        if(current == null) return;
        else {
            if(current.next == null){
                System.out.print(current.data+"-->");
                return;
            }
            displayReverse(current.next);
            System.out.print(current.data+"-->");
        }
    }

    public void deleteNodeAtBeginning(){
        if(head == null) return;
        else {
            if(head != tail) {
                head = head.next;
            }
        }
        System.out.println("Node At the Beginning deleted.");
    }

    public static void main(String[] args) {
        singleLL_deleteNodeAtBeginning dn = new singleLL_deleteNodeAtBeginning();
        Random rr = new Random();
        HashSet<Integer> hs = new HashSet<>();
        int i = 0;
        while(i!=10){
            int num = rr.nextInt(10);
            if(hs.add(num)){
                dn.addNode(num);
            }
            i++;
        }

        dn.display();
        dn.displayReverse(dn.head);
        dn.deleteNodeAtBeginning();
        dn.display();
        dn.deleteNodeAtBeginning();
        dn.display();

    }
}
