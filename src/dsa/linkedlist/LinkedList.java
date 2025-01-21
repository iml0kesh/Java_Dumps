package dsa.linkedlist;

class LinkNode {
    int data;
    LinkNode next;

    LinkNode (int x){
        this.data = x;
        next = null;
    }
}

public class LinkedList {

    LinkNode head = null;
    LinkNode tail = null;

    public void addNode(int n) {
        LinkNode newNode = new LinkNode(n);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Node Inserted");
    }

    public void deleteNode(){

    }

    public void displayList() {
        if(head == null) {
            System.out.println("List Empty");
        } else {
            LinkNode temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.displayList();
    }
}


