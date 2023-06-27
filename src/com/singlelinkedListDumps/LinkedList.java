package com.singlelinkedListDumps;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail =pre ;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void Prepend(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public Node removeFirst(){
        Node temp = null;
        if(length == 0){
            return null;
        }
        temp = head;
        temp.next = null;
        head = head.next;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    public Node getValue(int x){
        if(x < 0 || x >= length){
            return null;
        }
        Node temp = head;
        while(x-- > 0){
            temp = temp.next;
        }
        return temp;
    }

    public Boolean set(int index, int value){
        Node newNode = new Node(value);
        if(length == 0 && index == 0){
            head = newNode;
            tail = newNode;
            return true;
        }
        if(index > length){
            return false;
        }
        Node prev = head;
        Node nextn = head;
        while(index-- > 0){

        }
        return false;
    }
}