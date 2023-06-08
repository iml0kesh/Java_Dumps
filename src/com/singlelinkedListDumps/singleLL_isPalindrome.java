package com.singlelinkedListDumps;

public class singleLL_isPalindrome {
    class Node {
        int data;
        Node next;
        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int x){
        Node newNode = new Node(x);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public Node reverse(Node head){
        Node prev = null, curr = head, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(Node head){
        if(head == null) return true;
        if(head.next == null) return true;
        Node slow = head, fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;

        head2 = reverse(head2);
        while(head != null && head2 != null){
            if(head.data != head2.data){
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}
