package com.InterviewPrepProblems;

public class SLL_MergeTwoSortedLists {
    class Node {
        int data;
        Node next;
    }
    public static Node Merge(Node head1, Node head2){
        if(head1 == null && head2 == null) return null;
        if(head2 == null) return head1;
        if(head1 == null) return head2;

        if(head1.data <= head2.data){
            head1.next = Merge(head1.next,head2);
            return head1;
        } else {
            head1.next = Merge(head1,head2.next);
            return head2;
        }

    }
}
